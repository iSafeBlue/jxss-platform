package org.blue.xss.service;

import org.blue.xss.bean.User;
import org.blue.xss.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl  implements UserService{
	@Autowired
	private UserDao userDao;

	public User UserLoginCheck(String username, String password) {
		return userDao.UserLoginCheck(username , password);
	}

	public boolean userRegisterCheck(User user) {
		return userDao.userRegisterCheck(user);
	}

	public boolean checkUsernameAndEmail(String username, String email) {
		return userDao.checkUsernameAndEmail(username,email);
	}

	public boolean checkInviteCodeIsUsed(String code) {
		return userDao.checkInviteCodeIsUsed(code);
	}
	
}
