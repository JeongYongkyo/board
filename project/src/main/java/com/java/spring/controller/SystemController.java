package com.java.spring.controller;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.java.spring.service.SystemService;

@Controller
public class SystemController {
	Logger log = Logger.getLogger(this.getClass());

	@Resource(name="systemService")
	private SystemService systemService;
	
	@RequestMapping(value = "/main.do", method = RequestMethod.GET)
	public String main() {
		return "main";
	}
	
	@RequestMapping(value = "/timeline.do", method = RequestMethod.GET)
	public String timeline() {
		return "timeline";
	}
	
	@RequestMapping(value = "/visitor.do", method = RequestMethod.GET)
	public String visitor() {
		return "visitor";
	}
	
	@RequestMapping(value = "/calendar.do", method = RequestMethod.GET)
	public String calander() {
		return "calendar";
	}
	
	@RequestMapping(value = "/simpleSide.do", method = RequestMethod.GET)
	public String test() {
		return "simpleSide";
	}
}
