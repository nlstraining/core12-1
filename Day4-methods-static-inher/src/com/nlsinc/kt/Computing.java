package com.nlsinc.kt;

public class Computing {

	 int a =10;   // instance variable or data member
	 static int b = 20;
	 
	 void method(){ // non-static
		 
		 System.out.println(a);
		 System.out.println(b);
		 method2();
	 }
	 
	 static void method2(){
		 //method();
		// System.out.println(a);
		 System.out.println(b);
	 }
}



class Test{
	
//	 final  int a=10 ;
	int a=10;  	   
	    void method(){
	    	int a=20;
	    	//this.a = a;
	       	System.out.println(this.a + a);
	    }
	   
	    void method2(){
	    	
	    	System.out.println(a);
	    }
	    
	    
	    
}

class UseTest{
	
	public static void main(String[] args){
		
		
		                Test t = new Test();
		                t.method();
		                
		                
	}
	
}














