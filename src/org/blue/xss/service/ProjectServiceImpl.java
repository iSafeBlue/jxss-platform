package org.blue.xss.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.blue.xss.bean.Content;
import org.blue.xss.bean.Project;
import org.blue.xss.dao.ProjectDao;
import org.blue.xss.util.XssAndSqli;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class ProjectServiceImpl implements ProjectService{
	
	@Autowired
	private ProjectDao projectDao;

	public List ProjectList(int uid) {
		return projectDao.ViewProjectList(uid);
	}

	public boolean insertProject(Project project) {
		project.setPname(XssAndSqli.xssEncode(project.getPname()));
		project.setPdescription(XssAndSqli.xssEncode(project.getPdescription()));
		return projectDao.insertProject(project);
	}

	public boolean deleteProject(Project project) {
		return projectDao.deleteProject(project);
	}


	public List<Content> viewContentOfProject(Project project, int page,
			int pagesize, HttpServletRequest req) {
		return projectDao.viewContentOfProject(project , page , pagesize , req);
	}

	public void deleteContentsOfProject(Content content) {
		projectDao.deleteContentsOfProject(content);
	}


	
}
