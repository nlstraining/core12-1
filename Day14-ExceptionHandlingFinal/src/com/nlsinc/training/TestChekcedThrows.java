package com.nlsinc.training;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TestChekcedThrows {

	public static void m() throws Exception {

		 throw new Exception("throwing an exception with throw");
}
	public static void m2(){
			throw new ArithmeticException("Cannot divide  by zero");
       
}
 
	// since compiler is ensuring handling of exception or declaration in throws clause
	// we call it checked exception
	
	public static void main(String[] args) {

         //    m();
		m2();
		
	}

}
