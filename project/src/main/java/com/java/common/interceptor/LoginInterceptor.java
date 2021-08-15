package com.java.common.interceptor;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LoginInterceptor extends HandlerInterceptorAdapter {

	Logger log = Logger.getLogger(this.getClass());
	
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
            ModelAndView modelAndView) throws Exception {
        // TODO Auto-generated method stub
        super.postHandle(request, response, handler, modelAndView);
    }

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception{
		HttpSession session = request.getSession();
		if(session.getAttribute("login") == null) {
			log.info("There are no sessions saved.");
			//System.out.println("There are no sessions saved.");
			response.sendRedirect("/member/login.do");
			return false;
		} else {
			session.setMaxInactiveInterval(10*60);
		}
		log.info("There is a saved session.");
		return true;
		
	}
}


