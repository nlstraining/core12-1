package com.nlsinc.exceptions;

public class TestExceptions {

	public static void main(String[] args) {
		
		 // Java guarantees all expressions and all statements will be executed fully
            
		   //      int a = 10 + 0 / 0 - 20 ;     //1. when an exception occurs
		  //       System.out.println(a);
		  // logical &  logical short-circuit &&  ||
		 int a =10;
		 int a1= 20;
		 
		         boolean b =  a > a1 && 10/0 == 1; //2. when short-circuit operators are used
		         
		                                 //f             Exception comes 
		        //         System.out.println(b);
		    
		                 System.out.println("before expression......");
		                 int c = 10 + 0 / 0 - 20;// that is stopped and subsequent statements are also ignored
		                 System.out.println("after expression......");
		                //1. stops the program
		                 //2. creates the object of relevant Exception class
		                 //3. searches for a handler (exception handler) :
		                       //      i) handler found: transmits the control to handler -- > path in program
		                       //      ii) handler not found: abruptly terminate the program and display stack trace
		                 
		                 
	}

}
