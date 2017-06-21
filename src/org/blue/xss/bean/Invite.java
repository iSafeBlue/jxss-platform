package org.blue.xss.bean;

public class Invite {
	
	private int id;
	private String invitecode;
	private String credate;
	private int isuse;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getInvitecode() {
		return invitecode;
	}
	public void setInvitecode(String invitecode) {
		this.invitecode = invitecode;
	}
	public String getCredate() {
		return credate;
	}
	public void setCredate(String credate) {
		this.credate = credate;
	}
	public int getIsuse() {
		return isuse;
	}
	public void setIsuse(int isuse) {
		this.isuse = isuse;
	}
	public Invite(int id, String invitecode, String credate, int isuse) {
		this.id = id;
		this.invitecode = invitecode;
		this.credate = credate;
		this.isuse = isuse;
	}
	public Invite() {
	}
	@Override
	public String toString() {
		return "Invite [id=" + id + ", invitecode=" + invitecode + ", credate="
				+ credate + ", isuse=" + isuse + "]";
	}
	
	
}
