package com.java.spring.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.java.common.domain.BoardVO;
import com.java.common.domain.Criteria;

public interface BoardService {

	List<BoardVO> selectBoardList(Criteria cri) throws Exception;
	
	int boardListCount() throws Exception;

	Map<String, Object> selectBoardContent(int idx) throws Exception;

	int saveBoardWrite(HashMap<String, String> userParam) throws Exception;

	int delBoardWrite(HashMap<String, String> userParam) throws Exception;

	boolean plusCnt(int idx);
	
}

