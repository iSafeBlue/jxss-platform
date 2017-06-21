package org.blue.xss.bean;

import java.util.List;

public class User {
	
	private int userid;
	private String email;
	private String username;
	private String password;
	private List<Project> project;
	
	
	
	public User(String email, String username, String password) {
		this.email = email;
		this.username = username;
		this.password = password;
	}

	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public User(int userid, String email, String username, String password,
			List<Project> project) {
		super();
		this.userid = userid;
		this.email = email;
		this.username = username;
		this.password = password;
		this.project = project;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public User() {
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<Project> getProject() {
		return project;
	}
	public void setProject(List<Project> project) {
		this.project = project;
	}

	@Override
	public String toString() {
		return "User [userid=" + userid + ", email=" + email + ", username="
				+ username + ", password=" + password + ", project=" + project
				+ "]";
	}
	

}
