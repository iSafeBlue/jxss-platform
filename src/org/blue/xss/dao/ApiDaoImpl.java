package org.blue.xss.dao;

import javax.annotation.Resource;

import org.blue.xss.bean.Content;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ApiDaoImpl implements ApiDao{

	@Resource
	private SqlSessionTemplate session;

	public void insertContent(Content content) {
			session.insert("content.AddContentOfProject", content);
	}
	
}
