package com.java.spring.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.java.common.dao.AbstractDAO;

@Repository("profileDAO")
public class ProfileDAO extends AbstractDAO{

	private static final String NameSpace = "com.java.spring.service.ProfileService.";

	@SuppressWarnings("unchecked")
	public List<Map<String, Object>> selectUserInfo(String param) {
		return (List<Map<String, Object>>)selectList(NameSpace+"selectUserInfo", param);
	}

	public int editProfile(HashMap<String, String> userParam) {
		return super.insert(NameSpace+"editProfile", userParam);
	}

	public int deleteProfile(HashMap<String, String> userParam) {
		return super.delete(NameSpace+"deleteProfile", userParam);
	}

	public int checkDeleteProfile(HashMap<String, String> userParam) {
		return (Integer) selectOne(NameSpace+"checkDeleteProfile", userParam);
	} 

}
