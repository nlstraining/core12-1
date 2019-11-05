package com.nlsinc.oops;

public class A {
          int a=10;
}


class B extends A{
	int a = 20;
	
	void m(){
		
		System.out.println(this.a + super.a);
	}
	public static void main(String []args){
		
		 new B().m();
	}
}
