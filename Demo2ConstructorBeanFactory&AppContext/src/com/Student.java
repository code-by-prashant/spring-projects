package com;

public class Student {

	private int sid;
	private String sname;
	private int smarks;
	private String ssection;
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getSmarks() {
		return smarks;
	}
	public void setSmarks(int smarks) {
		this.smarks = smarks;
	}
	public String getSsection() {
		return ssection;
	}
	public void setSsection(String ssection) {
		this.ssection = ssection;
	}
	
	public void display() { 
		System.out.println("ID | NAME     | MARKS | SECTION");
		System.out.println(sid + "  | " + sname + " | " + smarks + "    | " + ssection); 
	} 
	
}

