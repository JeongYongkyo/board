package com.java.spring.dao;


import org.springframework.stereotype.Repository;

import com.java.common.dao.AbstractDAO;

@Repository("systemDAO")
public class SystemDAO extends AbstractDAO{

	private static final String NameSpace = "com.java.spring.service.SystemService.";
	
}
