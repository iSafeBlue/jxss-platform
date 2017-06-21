package org.blue.xss.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.blue.xss.bean.Content;
import org.blue.xss.bean.Project;
import org.blue.xss.bean.User;
import org.blue.xss.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@Scope("prototype")
@RequestMapping(value = "/Project")
public class ProjectController {
	@Autowired
	private ProjectService projectService;

	@RequestMapping(value = "/List")
	public String findProjectList(HttpServletRequest req) {
		User user = (User) req.getSession().getAttribute("user");
		int uid = (Integer) (user == null ? 0 : user.getUserid());
		List projectList = projectService.ProjectList(uid);
		req.setAttribute("projectList", projectList);

		/*
		 * ModelAndView modelAndView = new ModelAndView();
		 * modelAndView.addObject("projectList", projectList);
		 * modelAndView.setViewName("project");
		 */
		return "project";
	}

	@RequestMapping(value = "Add")
	public String findProjectAddPage() {
		return "projectadd";
	}

	@RequestMapping(value = "AddDo", method = RequestMethod.POST)
	public void insertProject(Project project, HttpServletRequest req,
			HttpServletResponse resp) throws IOException {
		project.setUser(((User) req.getSession().getAttribute("user"))
				.getUserid());

		boolean state = projectService.insertProject(project);

		if (state) {
			resp.getWriter().print(
					"<script>alert('添加成功');history.go(-1);</script>");
		} else {
			resp.getWriter().print(
					"<script>alert('添加失败');history.go(-1);</script>");
		}
	}

	@RequestMapping(value = "Delete", method = RequestMethod.POST)
	public void deleteProject(Project project, HttpServletRequest req,
			PrintWriter resp) {
		project.setUser(((User) req.getSession().getAttribute("user"))
				.getUserid());

		boolean state = projectService.deleteProject(project);

		resp.print(state);
	}

	@RequestMapping(value = "Content")
	public ModelAndView viewContentOfProject(Project project,
			HttpServletRequest req) {
		String tmppage = req.getParameter("page");
		int page = tmppage == null ? 1 : Integer.parseInt(tmppage);
		int pagesize = 20;

		ModelAndView modelAndView = new ModelAndView("content");

		project.setUser(((User) req.getSession().getAttribute("user"))
				.getUserid());

		List<Content> contentList = projectService.viewContentOfProject(
				project, page, pagesize, req);

		modelAndView.addObject("contentList", contentList);
		return modelAndView;
	}
	
	@RequestMapping(value="DeleteContent")
	public void deleteContentsOfProject(Content content ,PrintWriter printWriter){
		projectService.deleteContentsOfProject(content);
		printWriter.print("");
	}

}
