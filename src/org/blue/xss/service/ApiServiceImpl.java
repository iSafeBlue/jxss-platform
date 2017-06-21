package org.blue.xss.service;

import org.blue.xss.bean.Content;
import org.blue.xss.dao.ApiDao;
import org.blue.xss.util.XssAndSqli;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class ApiServiceImpl implements ApiService{
	
	@Autowired
	private ApiDao apiDao;

	public void insertContent(Content content) {

		apiDao.insertContent(
		new Content(0, 
							content.getPid(), 
							XssAndSqli.xssEncode(content.getLocation()), 
							XssAndSqli.xssEncode(content.getDomain()), 
							XssAndSqli.xssEncode(content.getContent()),
							null)
		);
	}

	
	
}
