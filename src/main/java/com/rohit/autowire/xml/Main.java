package com.rohit.autowire.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("autowire.xml");
		Employee employee = (Employee) context.getBean("employee");
		employee.getAddress();

	}

}
