package com.luv2code.springdemo;

import org.springframework.stereotype.Component;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class FileFortuneService implements FortuneService {
	
	private String fileName= "C:/Users/fortune-data.txt";
	private List<String> theFortunes;
	
	//create a random generator
	private Random myRandom = new Random();
	
	public FileFortuneService() {
		File theFile = new File(fileName);
		System.out.println("Reading fortunes from a file: " + theFile);
		System.out.println("File exists: "+theFile.exists());
		
		//initialize array List
		theFortunes = new ArrayList<String>();
		
		//read fortunes from file
		try (BufferedReader br = new BufferedReader(new FileReader(theFile))){
			
			String tempLine;
			
			while ((tempLine = br.readLine())!= null){
				theFortunes.add(tempLine);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Override
	public String getFortune() {
		//pick a random String from the Array
		
		int index = myRandom.nextInt(theFortunes.size());
		String tempFortune = theFortunes.get(index);
		return tempFortune;
	}

}
