package com.java.spring.service;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.java.spring.dao.ProfileDAO;

@Service("profileService") 
public class ProfileServiceImpl implements ProfileService{
	Logger log = Logger.getLogger(this.getClass()); 

	@Resource(name="profileDAO")
	private ProfileDAO profileDAO; 

	@Override
	public List<Map<String, Object>> selectUserInfo(String param) throws Exception {
		return profileDAO.selectUserInfo(param); 
	}

	@Override
	public int editProfile(HashMap<String, String> userParam) throws Exception {
		
		int result = 0;
		result = profileDAO.editProfile(userParam);
		if(result < 0) {
			throw new SQLException();
		}
		return result; 
	}

	@Override
	public int deleteProfile(HashMap<String, String> userParam) throws Exception {
		return profileDAO.deleteProfile(userParam);
	}
	
	@Override
	public int checkDeleteProfile(HashMap<String, String> userParam) throws Exception {
		return profileDAO.checkDeleteProfile(userParam);
	}
}

 