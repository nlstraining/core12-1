package com.nlsinc.training;

public class TestError {

	void m(){
	 m2();
		
	}
	void m2(){
		
		m();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
                 new TestError().m();
	}

}
