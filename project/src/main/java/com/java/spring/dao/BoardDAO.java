package com.java.spring.dao;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.java.common.dao.AbstractDAO;
import com.java.common.domain.BoardVO;
import com.java.common.domain.Criteria;

@Repository("boardDAO")
public class BoardDAO extends AbstractDAO{

	private static final String NameSpace = "com.java.spring.service.BoardService.";
	
	@SuppressWarnings("unchecked") 
	public List<BoardVO> selectBoardList(Criteria cri) throws Exception{
		return super.selectList(NameSpace+"selectBoardList", cri);
	}

	public int boardListCount() throws Exception{
		return (Integer) selectOne(NameSpace+"boardListCount");
	}
	
	@SuppressWarnings("unchecked")
	public Map<String, Object> selectBoardContent(int idx) throws Exception{
		return (Map<String, Object>) selectOne(NameSpace+"selectBoardContent", idx);
	}

	public int saveBoardWrite(HashMap<String, String> userParam) throws Exception{
		String page_tp = userParam.get("page_tp");
		int result = 0;
		
		if(page_tp.equals("u")) {
			result = update(NameSpace+"updateBoardWrite",userParam);
		} 
		else if(page_tp.equals("i")){
			result = insert(NameSpace+"insertBoardWrite", userParam);
		} 
		else {
			throw new SQLException();
		}
		return result;
	}

	public int delBoardWrite(HashMap<String, String> userParam) throws Exception{
		return super.update(NameSpace+"delBoardWrite",userParam);
	}

	public boolean plusCnt(int idx) {
		super.update(NameSpace+"plusCnt",idx);
		return true;
	} 

}
