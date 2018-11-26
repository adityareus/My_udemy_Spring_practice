package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		//load spring config
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean
		
		Coach theCoach = context.getBean("tennisCoach",Coach.class);
		
		//call methods on the bean
		
		System.out.println(theCoach.getDailyWorkout());
		
		
		System.out.println(theCoach.getDailyFortune());
		
		//close the context container
		context.close();

	}

}
