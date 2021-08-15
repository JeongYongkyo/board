package com.java.spring.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ProfileService {

	List<Map<String, Object>> selectUserInfo(String param) throws Exception;

	int editProfile(HashMap<String, String> userParam) throws Exception;

	int deleteProfile(HashMap<String, String> userParam) throws Exception;
	
	int checkDeleteProfile(HashMap<String, String> userParam) throws Exception;
	
}

