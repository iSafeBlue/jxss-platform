package org.blue.xss.service;

import org.blue.xss.bean.User;

public interface UserService {

	User UserLoginCheck(String username, String password);

	boolean userRegisterCheck(User user);

	boolean checkUsernameAndEmail(String username, String email);

	boolean checkInviteCodeIsUsed(String code);

}
