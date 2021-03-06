package com.jaceksysiak.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {
	
	public static void main(String[] args){
		
		//ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");
		ApplicationContext context = new ClassPathXmlApplicationContext("com/jaceksysiak/spring/test/beans/beans.xml");
		
		Person person = (Person) context.getBean("person");
		person.speak();
		
		System.out.println(person);
		
		//((FileSystemXmlApplicationContext)context).close();
		  ((ClassPathXmlApplicationContext)context).close();
	}

}
