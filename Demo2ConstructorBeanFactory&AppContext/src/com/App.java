package com;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class App {
	public static void main(String [] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//      Employee emp = (Employee)context.getBean("emp");
//		emp.display();
		
		Product product = (Product) context.getBean("product", Product.class);		
		product.display();
		
		Product product2 = (Product) context.getBean("product", Product.class);		
		product2.display();
		
		// Bean Factory example
        BeanFactory factory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
        Student student = (Student) factory.getBean("student");
        student.display();
	}
}
