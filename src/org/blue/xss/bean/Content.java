package org.blue.xss.bean;

public class Content {
	
	private int cid;
	private int pid;
	private String location;
	private String domain;
	private String content;
	private String date;
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Content(int cid, int pid, String location, String domain,
			String content, String date) {
		this.cid = cid;
		this.pid = pid;
		this.location = location;
		this.domain = domain;
		this.content = content;
		this.date = date;
	}
	public Content() {
	}
	@Override
	public String toString() {
		return "Content [cid=" + cid + ", pid=" + pid + ", location="
				+ location + ", domain=" + domain + ", content=" + content
				+ ", date=" + date + "]";
	}
	
	
}
