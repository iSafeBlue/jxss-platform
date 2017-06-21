package org.blue.xss.dao;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.blue.xss.bean.Content;
import org.blue.xss.bean.Project;

public interface ProjectDao {

	List ViewProjectList(int uid);

	boolean insertProject(Project project);

	boolean deleteProject(Project project);

	List<Content> viewContentOfProject(Project project, int page, int pagesize, HttpServletRequest req);

	void deleteContentsOfProject(Content content);


}
