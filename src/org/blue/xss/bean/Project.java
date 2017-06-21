package org.blue.xss.bean;

import java.util.List;

public class Project {
	
	private int pid;
	private int uid;
	private String pname;
	private String pdescription;
	private String createdate;
	private List<Content> data;
	private int page;
	
	
	
	public Project(int uid, String pname, String pdescription) {
		this.uid = uid;
		this.pname = pname;
		this.pdescription = pdescription;
	}
	public Project(int pid, int uid, String pname, String pdescription,
			String createdate, List<Content> data) {
		this.pid = pid;
		this.uid = uid;
		this.pname = pname;
		this.pdescription = pdescription;
		this.createdate = createdate;
		this.data = data;
	}
	public Project() {
	}
	
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public int getUser() {
		return uid;
	}
	public void setUser(int uid) {
		this.uid = uid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPdescription() {
		return pdescription;
	}
	public void setPdescription(String pdescription) {
		this.pdescription = pdescription;
	}
	public String getCreatedate() {
		return createdate;
	}
	public void setCreatedate(String createdate) {
		this.createdate = createdate;
	}
	public List<Content> getData() {
		return data;
	}
	public void setData(List<Content> data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "Project [pid=" + pid + ", uid=" + uid + ", pname=" + pname
				+ ", pdescription=" + pdescription + ", createdate="
				+ createdate + ", data=" + data + "]";
	}
	
}
