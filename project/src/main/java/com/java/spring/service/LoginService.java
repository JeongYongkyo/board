package com.java.spring.service;

import java.util.HashMap;
import java.util.Map;

import com.java.common.domain.VisitorVO;

public interface LoginService {

	Map<String,Object>selectLoginInfo(HashMap<String, String> userParam) throws Exception;
	
	int insertRegisterInfo(HashMap<String, String> userParam) throws Exception;

	int checkRegisterDuplicate(HashMap<String, String> userParam) throws Exception;
	
	int insertVisitor(VisitorVO visitorVO) throws Exception;
	
}