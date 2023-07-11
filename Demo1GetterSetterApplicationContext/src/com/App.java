package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String [] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
        Employee emp = (Employee)context.getBean("emp");
		emp.display();
		
		Product product = (Product)context.getBean("product");
		product.display();
	}
}
