package org.blue.xss.dao;

import javax.annotation.Resource;

import org.blue.xss.bean.Invite;
import org.blue.xss.bean.User;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao{

	@Resource
	private SqlSessionTemplate session;

	public User UserLoginCheck(String username, String password) {
		
		
		User user = session.selectOne("user.LoginCheck",new User(username, password));
		
		
		return user;
	}

	public boolean userRegisterCheck(User user) {
		int insert = session.insert("user.RegisterCheck", user);
		
		if(insert==1){
			return true;
		}
		
		return false;
	}

	public boolean checkUsernameAndEmail(String username, String email) {
		
		User user2 = new User();
		user2.setEmail(email);
		user2.setUsername(username);
		User user = session.selectOne("user.CheckUsernameAndEmail",user2);
		if(user==null){
			return false;
		}
		
		return true;
	}

	public boolean checkInviteCodeIsUsed(String code) {

		Invite invite = session.selectOne("invite.CheckInviteCode", code);
		
		if(invite==null || invite.getIsuse()==1){
			return true;
		}else{
			session.selectOne("invite.UpdateInviteUsed", code);
		}
		
		return false;
	}
	
	
	
}
