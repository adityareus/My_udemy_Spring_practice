package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		
		//load spring config
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		//retrieve bean
		
		Coach theCoach = context.getBean("tennisCoach",Coach.class);
		
		//call methods on the bean
		
		System.out.println(theCoach.getDailyWorkout());
		
		
		System.out.println(theCoach.getDailyFortune());
		
		//close the context container
		context.close();

	}

}
