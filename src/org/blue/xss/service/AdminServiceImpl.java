package org.blue.xss.service;

import java.util.List;

import org.blue.xss.bean.Admin;
import org.blue.xss.bean.Invite;
import org.blue.xss.dao.AdminDao;
import org.blue.xss.util.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class AdminServiceImpl implements AdminService{
	@Autowired
	private AdminDao adminDao;

	public Admin checkAdminLogin(Admin admin) {
		
		admin.setAdminpass(Utils.Md5(admin.getAdminpass()));
		
		return adminDao.checkAdminLogin(admin);
	}

	public List<Invite> findUsedInvite() {
		return adminDao.findUsedInvite();
	}

	public List<Invite> findUnusedInvite() {
		return adminDao.findUnusedInvite();
	}

	public void addInviteCode() {
		adminDao.addInviteCode();
	}
	
}
