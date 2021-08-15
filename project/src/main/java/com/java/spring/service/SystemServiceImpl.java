package com.java.spring.service;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.java.spring.dao.SystemDAO;

@Service("systemService") 
public class SystemServiceImpl implements SystemService{
	Logger log = Logger.getLogger(this.getClass()); 

	@Resource(name="systemDAO")
	private SystemDAO systemDAO; 

}

 