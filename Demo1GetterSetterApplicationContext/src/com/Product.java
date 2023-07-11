package com;

public class Product {
	private int pid;
	private String pname;
	private String pdesc;
	private int price;
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPdesc() {
		return pdesc;
	}
	public void setPdesc(String pdesc) {
		this.pdesc = pdesc;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void display(){ 
		System.out.println(pid+ " | "+ pname +" | "+ pdesc +" | "+ price); 
	} 
	
}
