package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String [] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Question question = (Question)context.getBean("question");
        question.display();
		
	}
}
