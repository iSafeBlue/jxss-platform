package org.blue.xss.service;

import java.util.List;

import org.blue.xss.bean.Admin;
import org.blue.xss.bean.Invite;

public interface AdminService {

	Admin checkAdminLogin(Admin admin);

	List<Invite> findUsedInvite();

	List<Invite> findUnusedInvite();

	void addInviteCode();

}
