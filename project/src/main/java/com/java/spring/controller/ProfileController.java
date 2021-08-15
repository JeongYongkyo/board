package com.java.spring.controller;

import java.sql.SQLException;
import java.util.HashMap;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.java.common.domain.UserVO;
import com.java.spring.service.ProfileService;

@Controller
public class ProfileController {
	Logger log = Logger.getLogger(this.getClass());

	@Resource(name="profileService")
	private ProfileService profileService;

	@RequestMapping(value = "profile.do", method = RequestMethod.GET)
	public String profile(Model model, HttpSession session) throws Exception {
		
		String returnURL = "";
		
		UserVO userVO = (UserVO) session.getAttribute("login");
		if(userVO != null) {
		    String u_id = userVO.getUserId();
		    
		    model.addAttribute("userProfile", profileService.selectUserInfo(u_id));
		    returnURL = "profile";
		}
		else {
			returnURL = "member/login";
		}
		
		return returnURL;
	}
	
	@ResponseBody
	@RequestMapping(value = "editProfile.do", method = RequestMethod.POST)
	public String editProfile(@RequestBody HashMap<String, String> userParam) throws Exception {

		int result = 0;
		result = profileService.editProfile(userParam);
		
		if(result < 0) {
			throw new SQLException();
		}
		return String.valueOf(result);
	}
	
	@ResponseBody
	@RequestMapping(value = "member/deleteProfile.do", method = RequestMethod.POST)
	public String deleteProfile(@RequestBody HashMap<String, String> userParam, HttpSession session) throws Exception {
		int result = 0;
		int checkPassword = profileService.checkDeleteProfile(userParam);
		
		if(checkPassword == 1) {
			result = profileService.deleteProfile(userParam);
			
			session.removeAttribute("login");
		}
		
		return String.valueOf(result);
	}
	
	@RequestMapping(value = "member/check_delete.do", method = RequestMethod.GET)
	public String check_delete() {
		return "member/check_delete";
	}
	
}
