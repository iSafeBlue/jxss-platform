package org.blue.xss.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.blue.xss.bean.User;
import org.blue.xss.service.UserService;
import org.blue.xss.util.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import sun.security.provider.MD5;

@Controller
@Scope("prototype")
@RequestMapping(value = "/User")
public class UserController {
	@Autowired
	private UserService userService;

	@RequestMapping(value = "/Login")
	public String LoginIndex() {

		return "login";
	}
	@RequestMapping(value="/Register")
	public String RegisterIndex(){
		
		return "register";
	}

	@RequestMapping(value = "/Logout")
	public String LoginOut(HttpServletRequest req)
			throws IOException {
		req.getSession().removeAttribute("user");
		return "redirect:Login.x";
	}
	
	@RequestMapping(value = "/RegisterCheck" , method = RequestMethod.POST)
	public void RegisterCheck(String code,String email , String username , String password,HttpServletResponse resp) throws IOException{
		
		String  emailRegx = "\\w+(\\.\\w)*@\\w+(\\.\\w{2,3}){1,3}";
		String nameRegx = "\\w{4,10}";

		if( email.matches(emailRegx)
				&& username.matches(nameRegx)
				&& !userService.checkUsernameAndEmail(username , email)
				&& !userService.checkInviteCodeIsUsed(code)
		){
			User user = new User(email, username, Utils.Md5(password));
			System.out.println(user);
			boolean i = userService.userRegisterCheck(user);
			resp.getWriter().print(i);
		}else{
			resp.getWriter().print(false);
		}
	}
	
	@RequestMapping(value = "/LoginCheck", method = RequestMethod.POST)
	public void LoginCheck(String username, String password,
			HttpServletRequest req, HttpServletResponse resp)
			throws IOException {

		if (username == null || password == null || "".equals(username)
				|| "".equals(password)) {
			resp.getWriter().print(
					"<script>alert('用户名或密码为空');history.go(-1);</script>");
		} else {
			User user = userService.UserLoginCheck(username, Utils.Md5(password));
			if (user != null) {
				req.getSession().setAttribute("user", user);
				
				resp.sendRedirect("../Project/List.x");
			} else {
				resp.getWriter().print(
						"<script>alert('用户名或密码不正确');history.go(-1);</script>");
			}

		}

	}

}
