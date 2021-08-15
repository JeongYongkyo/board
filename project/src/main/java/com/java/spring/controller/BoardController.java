package com.java.spring.controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.java.common.domain.Criteria;
import com.java.common.domain.Pagination;
import com.java.common.domain.UserVO;
import com.java.spring.service.BoardService;

@Controller
public class BoardController {
	Logger log = Logger.getLogger(this.getClass());

	@Resource(name="boardService")
	private BoardService boardService;
	
    /**
     * 게시판 조회
     * @param boardVO
     * @param model
     * @return
     * @throws Exception
     */
	@RequestMapping(value="board/boardlist.do", method=RequestMethod.GET) 
	public String boardList(Model model, Criteria cri) throws Exception {
		//log.info("list");
		model.addAttribute("list", boardService.selectBoardList(cri));
	    
		Pagination pagination = new Pagination();
		pagination.setCri(cri);
		pagination.setTotalCount(boardService.boardListCount());

		model.addAttribute("pagenation", pagination);
	    return "board/boardlist";
	}
	
	@RequestMapping(value = "board/boardwrite/{page_tp}/{idx}.do", method=RequestMethod.GET)
	public String boardWrite(Model model, @PathVariable("page_tp") String page_tp, @PathVariable("idx") int idx, HttpSession session) throws Exception {

		UserVO userVO = (UserVO) session.getAttribute("login");
		List<Map<String,Object>> paramList = new ArrayList<Map<String, Object>>();
		
		if(userVO != null) {
		    String u_id = userVO.getUserId();
		    String u_name = userVO.getUserName();
		
		    if(page_tp.equals("u")){
				
		    	Map<String,Object> map = boardService.selectBoardContent(idx);
		    	
		    		String contents = map.get("CONTENTS").toString();
		    		contents = contents.replaceAll("(\n|\r)", "").replaceAll("\"", "");
		    		//contents.replaceAll("(\\r\\n|\\r|\\n|\\n\\r)", "<br>");
		    		//System.out.println("contents :"+contents);
		    	
			    	map.put("page_tp", page_tp);
			    	map.put("login_id", u_id);
			    	map.put("name", u_name);
			    	map.put("index", idx);
			    	map.put("contents", contents);
				
			    	paramList.add(map);
			    	
			    	boardService.plusCnt(idx);
				
				model.addAttribute("contents", paramList);
		    } else if (page_tp.equals("i")){

		    	Map<String,Object> map = new HashMap<String,Object>();
			    	map.put("page_tp", page_tp);
			    	map.put("login_id", u_id);
			    	map.put("name", u_name);
			    	
			    	paramList.add(map);
					
					model.addAttribute("contents", paramList);
			}
		    
		}
		
		return "board/boardwrite";
	}

	@ResponseBody
	@RequestMapping(value = "board/savewrite.do", method=RequestMethod.POST)
	public String saveBoardWrite(@RequestBody HashMap<String, String> userParam) throws Exception {
		
		int result = 0;
		result = boardService.saveBoardWrite(userParam);
		
		if(result != 1) {
			throw new SQLException();
		}
		return String.valueOf(result);
	}
	
	@ResponseBody
	@RequestMapping(value = "board/delwrite.do", method=RequestMethod.POST)
	public String delBoardWrite(@RequestBody HashMap<String, String> userParam) throws Exception {
		
		int result = 0;
		result = boardService.delBoardWrite(userParam);
		
		if(result != 1) {
			throw new SQLException();
		}
		return String.valueOf(result);
	}
	
}
