package org.blue.xss.bean;

public class Admin {
	
	private int id;
	private String adminname;
	private String adminpass;
	public Admin(int id, String adminname, String adminpass) {
		this.id = id;
		this.adminname = adminname;
		this.adminpass = adminpass;
	}
	public Admin() {
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAdminname() {
		return adminname;
	}
	public void setAdminname(String adminname) {
		this.adminname = adminname;
	}
	public String getAdminpass() {
		return adminpass;
	}
	public void setAdminpass(String adminpass) {
		this.adminpass = adminpass;
	}
	@Override
	public String toString() {
		return "Admin [id=" + id + ", adminname=" + adminname + ", adminpass="
				+ adminpass + "]";
	}
	
	

}
