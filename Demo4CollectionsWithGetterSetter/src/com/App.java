package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String [] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person = (Person)context.getBean("person");
//        person.display();
		
        System.out.println(person.getPid() +" | " + person.getName()+"\n");
        
        
        System.out.println("Hobbies: ");
        String [] hobbies = person.getHobbies();
        for (String hobby : hobbies) {
            System.out.println("- " + hobby);
        }
        System.out.println("");
        
        ArrayList <String> email = person.getEmail();
        System.out.println("Emails: ");
        for (String emails : email) {
            System.out.println("- " + emails);
        }
        System.out.println("");
        
        HashSet <String> phone = person.getPhone();
        System.out.println("Phone Numbers: ");
        for (String phoneNumber : phone) {
            System.out.println("- " + phoneNumber);
        }
        System.out.println("");
        
        HashMap <String, String> education = person.getEducation();
        System.out.println("Education: ");
        for (String key : education.keySet()) {
            System.out.println("- " + key + ": " + education.get(key));
        }
	}
}
