package org.blue.xss.dao;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.blue.xss.bean.Content;
import org.blue.xss.bean.Project;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ProjectDaoImpl implements ProjectDao {

	@Resource
	private SqlSessionTemplate session;

	public List ViewProjectList(int uid) {

		List<Object> proList = session.selectList("project.ViewProjectList",
				uid);

		return proList;
	}

	public boolean insertProject(Project project) {

		int insert = session.insert("project.AddProject", project);

		if (insert == 1) {
			return true;
		}

		return false;
	}

	public boolean deleteProject(Project project) {

		int delete = session.delete("project.DeleteProject", project);

		if (delete == 1) {
			return true;
		}

		return false;
	}


	public List<Content> viewContentOfProject(Project project, int page,
			int pagesize, HttpServletRequest req) {

		Project pro;
		List<Content> contentList;
		
		pro = session.selectOne("project.CheckProjectAndUser", project);
		if(pro==null){
			return new ArrayList<Content>();
		}
		int count = session.selectOne("content.countContentOfProject",project);
		int ppage = page<=1?1:page-1;
		int tpage = (int) Math.ceil((double)count / pagesize);
		int npage = page>=tpage?tpage:page+1;
		
		req.setAttribute("ppage", ppage);
		req.setAttribute("tpage", tpage);
		req.setAttribute("npage", npage);
		project.setPage((page-1)*pagesize);
		contentList = session.selectList("content.viewContentOfProjectList", project);
		
		return contentList;
		
		
	}

	public void deleteContentsOfProject(Content content) {
		session.delete("content.deleteContentsOfProject", content);
	}

}
