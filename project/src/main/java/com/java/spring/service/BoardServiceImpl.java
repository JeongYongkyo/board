package com.java.spring.service;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.java.common.domain.BoardVO;
import com.java.common.domain.Criteria;
import com.java.spring.dao.BoardDAO;

@Service("boardService") 
public class BoardServiceImpl implements BoardService{
	Logger log = Logger.getLogger(this.getClass()); 

	@Resource(name="boardDAO")
	private BoardDAO boardDAO; 

	@Override
	public List<BoardVO> selectBoardList(Criteria cri) throws Exception {
		return boardDAO.selectBoardList(cri); 
	}

	@Override
	public int boardListCount() throws Exception {
		return boardDAO.boardListCount(); 
	}
	
	@Override
	public Map<String, Object> selectBoardContent(int idx) throws Exception{
		return boardDAO.selectBoardContent(idx); 
	}

	@Override
	public int saveBoardWrite(HashMap<String, String> userParam) throws Exception {
		int result = 0;
		result = boardDAO.saveBoardWrite(userParam);
		if(result < 1) {
			throw new SQLException();
		}
		return result; 
	}

	@Override
	public int delBoardWrite(HashMap<String, String> userParam) throws Exception {
		int result = 0;
		result = boardDAO.delBoardWrite(userParam);
		if(result < 1) {
			throw new SQLException();
		}
		return result; 
	}

	@Override
	public boolean plusCnt(int idx) {
		return boardDAO.plusCnt(idx); 
	}

}

 