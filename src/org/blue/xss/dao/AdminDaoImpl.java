package org.blue.xss.dao;

import java.util.List;

import org.blue.xss.bean.Admin;
import org.blue.xss.bean.Invite;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AdminDaoImpl implements AdminDao{
	@Autowired
	private SqlSessionTemplate session;

	public Admin checkAdminLogin(Admin admin) {
		
		Admin adm = session.selectOne("admin.checkAdminLogin", admin);
		
		return adm;
	}

	public List<Invite> findUnusedInvite() {
		List<Invite> unusedlist = session.selectList("invite.ViewUnusedInviteCode");
		
		return unusedlist;
	}

	public List<Invite> findUsedInvite() {
		List<Invite> usedlist = session.selectList("invite.ViewUsedInviteCode");
		
		return usedlist;
	}

	public void addInviteCode() {
		session.insert("invite.AddInviteCode");
	}
	
}
