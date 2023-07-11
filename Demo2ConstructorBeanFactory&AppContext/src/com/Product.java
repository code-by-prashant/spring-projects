package com;

public class Product {
	private int pid;
	private String pname;
	private String pdesc;
	private int price;
	
	
	public Product(int pid, String pname, String pdesc, int price) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pdesc = pdesc;
		this.price = price;
	}


	public void display(){ 
		System.out.println("ID | NAME  | DESCRIPTION | PRICE");
		System.out.println(pid+ "  | "+ pname +" | "+ pdesc +"      | "+ price); 
		System.out.println("__________________________________________\n");
	} 
	
}
