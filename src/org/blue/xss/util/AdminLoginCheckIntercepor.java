package org.blue.xss.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.blue.xss.bean.Admin;
import org.springframework.web.servlet.ModelAndView;

public class AdminLoginCheckIntercepor implements org.springframework.web.servlet.HandlerInterceptor{

	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		
	}

	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2, ModelAndView arg3) throws Exception {
		
	}

	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
			Object arg2) throws Exception {
		
		HttpSession session = request.getSession(true);
        
		Admin admin = (Admin) session.getAttribute("admin");
		
		
        if(admin==null){
        		response.sendRedirect("../Admin/Login.x");
        		return false;
        }
		return true;
	}



}
