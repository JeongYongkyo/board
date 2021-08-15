package com.java.spring.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.java.common.domain.UserVO;
import com.java.common.domain.VisitorVO;
import com.java.spring.service.LoginService;

@Controller
public class LoginController {
	Logger log = Logger.getLogger(this.getClass());

	@Resource(name="loginService")
	private LoginService loginService;

	@RequestMapping(value = "member/login.do", method = RequestMethod.GET)
	public String login() {
		return "member/login";
	}
	
	@ResponseBody
	@RequestMapping(value = "member/login.do", method = RequestMethod.POST)
	public Map<String, String> login(@RequestBody HashMap<String, String> userParam, HttpSession session, Model model) throws Exception {
		Map<String, String> rtnData = new HashMap<String, String>();		
		
		HttpServletRequest req = ((ServletRequestAttributes)RequestContextHolder.currentRequestAttributes()).getRequest();
		
		if ( session.getAttribute("login") !=null ){
            session.removeAttribute("login");
        }
		
		String returnURL = "";
		String msg = "";
		
		Map<String,Object> loginInfo = loginService.selectLoginInfo(userParam);

		if(loginInfo != null) {
			UserVO userVO = new UserVO();
			VisitorVO visitorVO = new VisitorVO();
			
			if(loginInfo.get("USER_ID") != "" && loginInfo.get("PASSWORD") != "") {
				userVO.setUserId(loginInfo.get("USER_ID").toString());
				//userVO.setUserPw(loginInfo.get("PASSWORD").toString());
				userVO.setUserName(loginInfo.get("NAME").toString());
				userVO.setUserGender(loginInfo.get("GENDER").toString());

				session.setAttribute("login", userVO);
				
				returnURL = "main.do";
				msg = "정상적으로 로그인 되었습니다.";
				
				visitorVO.setUser_id(loginInfo.get("USER_ID").toString());
				visitorVO.setVisit_ip(req.getRemoteAddr());
				visitorVO.setVisit_agent(req.getHeader("User-Agent"));
				visitorVO.setVisit_refer(req.getHeader("referer"));
				
				loginService.insertVisitor(visitorVO);

			}
		}
		else {
			returnURL = "member/login.do";
			msg = "아이디 또는 비밀번호가 일치하지 않습니다.";
		}
		rtnData.put("URL", returnURL);
		rtnData.put("MSG", msg);
		
		return rtnData;
	}
	
	@RequestMapping(value = "member/register.do", method = RequestMethod.GET)
	public String register() {
		return "member/register";
	}
	
	@ResponseBody
	@RequestMapping(value = "member/register.do", method = RequestMethod.POST)
	public String register(@RequestBody HashMap<String, String> userParam) throws Exception {

		int result = 0;
		result = loginService.insertRegisterInfo(userParam);
		
		if(result != 1) {
			throw new SQLException();
		}
		return String.valueOf(result);
	}
	
	@RequestMapping(value = "member/check_id.do", method = RequestMethod.GET)
	public String check_id() {
		return "member/check_id";
	}
	
	@ResponseBody
	@RequestMapping(value = "member/check_id.do", method = RequestMethod.POST)
	public int checkRegisterDuplicate(@RequestBody HashMap<String, String> userParam) throws Exception {
		return loginService.checkRegisterDuplicate(userParam);
	}
	
	@ResponseBody
	@RequestMapping(value = "logout.do", method = RequestMethod.POST)
	public String logout(HttpSession session) throws Exception {
		session.invalidate();
		//session.removeAttribute("login");
		return "member/login.do";
	}
	
}