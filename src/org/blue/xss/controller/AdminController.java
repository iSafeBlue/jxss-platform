package org.blue.xss.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.blue.xss.bean.Admin;
import org.blue.xss.bean.Invite;
import org.blue.xss.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@Scope("prototype")
@RequestMapping("/Admin")
public class AdminController {
	@Autowired
	private AdminService adminService;
	
	@RequestMapping(value="/Login")
	public String AdminLogin(){
		return "adminlogin";
	}
	
	
	@RequestMapping(value="/LoginCheck")
	public String checkAdminLogin(Admin admin , HttpServletRequest req){
		
		Admin adm = adminService.checkAdminLogin(admin);
		if(adm!=null){
			req.getSession().setAttribute("admin", adm);
			return "redirect:AdminIndex.x";
		}
		
		return "redirect:Login.x";
	}
	
	@RequestMapping(value="/AdminIndex")
	public ModelAndView AdminIndex(){
		ModelAndView modelAndView = new ModelAndView("invite");
		List<Invite> usedInviteList = adminService.findUsedInvite();
		List<Invite> unusedInviteList = adminService.findUnusedInvite();
		modelAndView.addObject("usedInviteList", usedInviteList);
		modelAndView.addObject("unusedInviteList", unusedInviteList);
		return modelAndView;
	}
	
	@RequestMapping(value="AdminInviteAdd")
	public void AddInvite(PrintWriter printWriter){
		adminService.addInviteCode();
		printWriter.print("");
	}
	
	
	
	
}
