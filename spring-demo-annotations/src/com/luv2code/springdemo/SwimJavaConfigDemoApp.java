package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		
		//load spring config
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		//retrieve bean
		
		Coach theCoach = context.getBean("swimCoach",Coach.class);
		
		//call methods on the bean
		
		System.out.println(theCoach.getDailyWorkout());
		
		
		System.out.println(theCoach.getDailyFortune());
		
		//close the context container
		context.close();

	}

}
