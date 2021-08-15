package com.java.spring.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.java.common.dao.AbstractDAO;
import com.java.common.domain.VisitorVO;

@Repository("loginDAO")
public class LoginDAO extends AbstractDAO{
	
	private static final String NameSpace = "com.java.spring.service.LoginService.";
	
	@SuppressWarnings("unchecked")
	public Map<String, Object> selectLoginInfo(HashMap<String, String> userParam) throws Exception{
		return (Map<String, Object>)selectOne(NameSpace+"selectLoginInfo", userParam);
	}

	public int insertRegisterInfo(HashMap<String, String> userParam) throws Exception{
		return super.insert(NameSpace+"insertRegisterInfo", userParam);
	}

	public int checkRegisterDuplicate(HashMap<String, String> userParam) throws Exception{
		return (Integer) selectOne(NameSpace+"checkRegisterDuplicate", userParam);
	}

	public int insertVisitor(VisitorVO visitorVO) {
		return super.insert(NameSpace+"insertVisitor", visitorVO);
	}
	
}