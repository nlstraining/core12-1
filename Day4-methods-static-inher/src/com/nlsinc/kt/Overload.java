package com.nlsinc.kt;

public class Overload {

	void m(){
	final  int a =10;
		
	}
	void m(int a){}
	//void m(int a, int b){} // 32
	//void m(int d, int c){}
	void m(Short s, Short t){}
	void m(long d, long c){} //64
	void m(double a, double b){}
	//void m(int a, double b){}
	//void m(double a, int b){}
	//  m(){} a method cannot be overloaded by changing return type alone
	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Overload obj = new Overload();
             obj.m();
                                       // same or super (wider)
             obj.m(10d,20d);  // implicit widening or every method creates a conversion context 
	}

}
