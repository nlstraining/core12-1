package com.nlsinc.training;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TestChecked  {

	public static void m() throws FileNotFoundException  {
		
		           File f = new File("TestError.java");
		           FileInputStream fis = new FileInputStream(f);// knife , fire and explosives , Accident Zone 
	}
	
	
	public static void main(String[] args) {
	 
		   try {
			m();
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		}
      System.out.println("Gracefull termination................");
	}

}
