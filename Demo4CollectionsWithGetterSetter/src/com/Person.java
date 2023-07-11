package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Person {
	private Integer pid;
	private String name;
	private String[] hobbies;
	private ArrayList<String> email;
	private HashSet <String> phone;
	private HashMap<String, String> education;
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String[] getHobbies() {
		return hobbies;
	}
	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}
	public ArrayList<String> getEmail() {
		return email;
	}
	public void setEmail(ArrayList<String> email) {
		this.email = email;
	}
	public HashSet<String> getPhone() {
		return phone;
	}
	public void setPhone(HashSet<String> phone) {
		this.phone = phone;
	}
	public HashMap<String, String> getEducation() {
		return education;
	}
	public void setEducation(HashMap<String, String> education) {
		this.education = education;
	}
	
	public void display() {
        System.out.println("Person Details:\n");
        
        System.out.println("PID: " + pid);
        System.out.println("Name: " + name+"\n");
        
        System.out.println("Hobbies: ");
        for (String hobby : hobbies) {
            System.out.println("- " + hobby);
        }
        System.out.println("");
        System.out.println("Emails: ");
        for (String email : email) {
            System.out.println("- " + email);
        }
        System.out.println("");
        System.out.println("Phone Numbers: ");
        for (String phoneNumber : phone) {
            System.out.println("- " + phoneNumber);
        }
        System.out.println("");
        System.out.println("Education: ");
        for (String key : education.keySet()) {
            System.out.println("- " + key + ": " + education.get(key));
        }
    }
	
}
