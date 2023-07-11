package com;

public class Employee {

	private int uid;
	private String name;
	private int age;
	private int salary;
	private String desig;
	
	
	public Employee(int uid, String name, int age, int salary, String desig) {
		super();
		this.uid = uid;
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.desig = desig;
	}


	public void display() { 
		System.out.println("ID | NAME     | AGE | SALARY | DESIGNATION");
		System.out.println(uid+"  | "+name+" | "+age+"  | "+salary+"  | "+desig); 
		System.out.println("__________________________________________\n");
	} 
	
}