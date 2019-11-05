package com.nlsinc.oops;

class Dog{
	
}

public class TestRefs {

	public static void main(String[] args) {
				
		int a = 10;
		int b= -10;
		boolean result = a == b; // primitives comparison , comparing values
       System.out.println(result);
       
        Dog d = new Dog();
   //     result = result == a;  //== is equals operator relational or comparison 
   //     result = a == d;
        Dog e = new Dog();
        result =  d == e;     // are they created using new operator or not?
        System.out.println(" (d == e) : " + result);
        System.out.println("d = "+ d);
        System.out.println("e = "+  e);
       
        Dog f = e; // copying e's reference  - one lock and two keys 
        result = e == f;
        System.out.println("f = "+ f);
        System.out.println(" (f == e) : " + result);
        
        Dog g = null; //it doesn't point to any object in memory
        result = e == g;
        System.out.println(" (g == e) : " + result);
   //     System.out.println( true == null);
        
        
	}

}
