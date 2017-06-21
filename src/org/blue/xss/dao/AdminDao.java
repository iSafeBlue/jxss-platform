package org.blue.xss.dao;

import java.util.List;

import org.blue.xss.bean.Admin;
import org.blue.xss.bean.Invite;

public interface AdminDao {

	Admin checkAdminLogin(Admin admin);

	List<Invite> findUnusedInvite();

	List<Invite> findUsedInvite();

	void addInviteCode();

}
