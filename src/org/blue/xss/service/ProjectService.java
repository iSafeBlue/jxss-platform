package org.blue.xss.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.blue.xss.bean.Content;
import org.blue.xss.bean.Project;

public interface ProjectService {

	List ProjectList(int uid);

	boolean insertProject(Project project);

	boolean deleteProject(Project project);

	List<Content> viewContentOfProject(Project project, int page, int pagesize, HttpServletRequest req);

	void deleteContentsOfProject(Content content);

}
