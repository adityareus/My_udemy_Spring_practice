package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	//create a random array of fortunes (strings)
	
	private String[] data={
			"This is the first fortune!", "This is the second fortune!!","This is the 3rd fortune!!!"
	};
	
	//create a random number generator to pick any of the the random fortunes
	private Random myRandom = new Random();
	
	
	//picking one of the random fortunes:-
	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		int index = myRandom.nextInt(data.length);
		String theFortune = data[index];
		return theFortune;
	}

}
