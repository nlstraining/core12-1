package com.nlsinc.strings;

// this problem produces sum of ten numbers

public class TestStrings {

	public static void main(String[] args) {
	
             // what is a string = any combination letters, digits and other characters on keyboard enclosed in "" 
	 int i = 007;
	// System.out.println(i );
//	 String str = new String("007");
	// System.out.println(str + i + 9); // concatination +  LtoR
	//// System.out.println(i+9+ str); // == != , +  - string with operations creates widening context
	 // bytes , short --> int -> long -> double 
	 
	// byte b = (10 + 10.0);
	 
	 String movie = new String("Titanic");
	 String hero = new String("DeCaprio Jack the Poor Boy ");
	 String heroin  = new String("Kate Winslet");
	 
	 // operations on strings;
	 
	  System.out.println(hero.length() > heroin.length() ? hero.length(): heroin.length() );
	  
	  // case 
	/*  System.out.println(movie.toLowerCase());
	  System.out.println(movie.toUpperCase());
	  movie = movie.toLowerCase();//                 A a = new A();   A a1 = new A();  a= a1;//
	  System.out.println(movie);
	*/  
	  // position
	  
	  System.out.println(heroin.charAt(heroin.length()-1));
	  // length = 12 ( 1 @ 0 , 12 the letter 12-1
	  
	  for( i =0; i<heroin.length();i++){
		  
		            System.out.println(heroin.charAt(i));
		  
	  }
	  
	 System.out.println(heroin.indexOf("W"));
	 
	 System.out.println(heroin.substring(5,7+1));  // Win - 
	 
	 String email = new String("bond.james@hollywood.com"); //L2R
	 System.out.println(email.indexOf(".",email.indexOf(".")+1)); //R2L
	 // StringBuilder and StringBuffer : these two are mutable - you can modify not constants
	 // StringBuilder is not-thread safe , StringBuffer is thread safe
	 
	 
	 
	 
	 
	}

}
