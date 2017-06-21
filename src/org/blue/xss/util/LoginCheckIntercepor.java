package org.blue.xss.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.blue.xss.bean.User;
import org.springframework.web.servlet.ModelAndView;

public class LoginCheckIntercepor implements org.springframework.web.servlet.HandlerInterceptor{

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
        
		User user = (User) session.getAttribute("user");
		
		
        if(user==null){
        	
        	//if(request.getRequestURI().indexOf("User")<0){
        		response.sendRedirect("../User/Login.x");
        		return false;
        	//}
       
        }
		return true;
	}


/*	public void doFilter(ServletRequest arg0, ServletResponse arg1,
			FilterChain chain) throws IOException, ServletException {
		
        HttpServletRequest request = (HttpServletRequest)arg0;     
        HttpServletResponse response  =(HttpServletResponse) arg1;
        
        HttpSession session = request.getSession(true);
        
        Object user = session.getAttribute("user");
        
        if(user==null || user.equals("")){
        	
        	if(request.getRequestURI().indexOf("User")<0){
        		response.sendRedirect("../User/Login.x");
        	}
       
        }
        chain.doFilter(arg0, arg1);
     
	}*/


}
