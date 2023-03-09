package com.rohit.autowire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new  AnnotationConfigApplicationContext(ApplicationConfig.class);
		Employee employee = (Employee) context.getBean("employee");
		employee.displayInfo();

	}

}
