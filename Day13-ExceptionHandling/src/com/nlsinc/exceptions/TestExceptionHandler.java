package com.nlsinc.exceptions;


// bench
// a>b->c->d->a
//1. exit gracefully and not break other dependent modules
//2. log the issues so that the performance history is maintained

public class TestExceptionHandler {

	public static void main(String[] args) {
		// terminating - abruptly or gracefully

        System.out.println("before expression......");
        try{
        	
        	      
        int c = 10 + 0 / 0 - 20;
        }catch(ArithmeticException e){
        	
        	e.printStackTrace();  // we will log this exception in software bugs and issues file
        }
        System.out.println("after expression......");

	}

}
