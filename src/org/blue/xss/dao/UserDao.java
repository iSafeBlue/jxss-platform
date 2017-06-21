package org.blue.xss.dao;

import org.blue.xss.bean.User;

public interface UserDao {

	User UserLoginCheck(String username, String password);

	boolean userRegisterCheck(User user);

	boolean checkUsernameAndEmail(String username, String email);

	boolean checkInviteCodeIsUsed(String code);

}
