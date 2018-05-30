package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		//load Spring Configuration/"config" file (This is what he called "create spring container" before)
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve a bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		//call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		//close the (application) context
		context.close();
	}

}
