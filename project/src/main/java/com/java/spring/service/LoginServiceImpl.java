package com.java.spring.service;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.java.common.domain.VisitorVO;
import com.java.spring.dao.LoginDAO;

@Service("loginService") 
public class LoginServiceImpl implements LoginService{
	Logger log = Logger.getLogger(this.getClass());

	@Resource(name="loginDAO")
	private LoginDAO loginDAO; 

	@Override
	public Map<String, Object>selectLoginInfo(HashMap<String, String> userParam) throws Exception {
		return (Map<String, Object>) loginDAO.selectLoginInfo(userParam);
	}

	@Override
	public int insertRegisterInfo(HashMap<String, String> userParam) throws Exception {
		
		int result = 0;
		result = loginDAO.insertRegisterInfo(userParam);
		if(result < 1) {
			throw new SQLException();
		}
		return result; 
	}

	@Override
	public int checkRegisterDuplicate(HashMap<String, String> userParam) throws Exception {
		return loginDAO.checkRegisterDuplicate(userParam);
	}

	@Override
	public int insertVisitor(VisitorVO visitorVO) throws Exception {
		return loginDAO.insertVisitor(visitorVO);
	}

}

 