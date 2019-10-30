package com.nlsinc.kt;

public class Calculator {

	// a method has two phases 1 . definition 2. method invocation
	// two types of methods : 1. instance methods 2. static methods
	int add()//  method head                       // anonymous block - this is valid in Java
	{        // method body
	int a=10; // local variables or auto variables 
	int b=20;  // the scope of the variables is method scope only
	int c = a+ b;
	//System.out.println(c);
	return c;
	}
	
	int add(int a, int b)//  method head                       // anonymous block - this is valid in Java
	{        // method body
	//int a=10; // local variables or auto variables 
//	int b=20;  // the scope of the variables is method scope only
	int c = a+ b;
	//System.out.println(c);
	return c;
	}
	
	int subtract(){
		
		int  a= 20;
		int b= 10;
		int c = a -b;
		//System.out.println(c);
		return c;
	}
	
 int power(){
		
		int b =2;
		int e = 4;
	    int result =1;
	    int i=1;
	    while(i <= e){
	    	
	    	    result = result * b;
	    	    i++;
	    }
	  //  System.out.println(result);
	    return result;
	}
	
	 int  power(int b,int e){ // parameters - input to the method - two pin
		 
		 int result =1;
		    int i=1;
		    while(i <= e){
		    	
		    	    result = result * b;
		    	    i++;
		    }
		   // System.out.println(result);
		    return result;
	 }
	 
	 int cube(int b) {
	        int result = 1;
	       // int b = 2;
	        int i =1;
	        while(i<=3) {
	            result = result*b;
	            i++;
	        }
	      //  System.out.println(result);
	  return result;  
	 }
	 
	static void printLine(int dots){
		 
		 for(int i=1;i <= dots; i++){
			 
			 System.out.print(".");
			 
		 }
		 System.out.println();
	 } 
	 
	 
	 
}
