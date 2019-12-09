package com.nlsinc.strings;
 
class A{
	
	 int a;
	 A(int a){
		 
		 this.a = a;
	 }
}
class B{
	
	int b;
	B(int b){
		
		this.b = b;
	}
}

public class TestStrings {
	

	/*String str = new String("missiSSIPI");
	String str1 = str.substring(0, (str.length()/2));
	String str2 = str.substring(str.length()/2, str.length());
	
	System.out.println(str1.toUpperCase());
	System.out.println(str2.toLowerCase());*/
	
	public static void main(String[] args) {
		
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		
		boolean same = s1 == s2;  // == are these objects created with new or not         
		//System.out.println(same);  
		same = s1.equals(s2);
	//	System.out.println(same);

		A  a1 = new A(10);
		A a2 = new A(10);
		same = a1 == a2;
		//System.out.println(same);
		same = a1.equals(a2); // inside equals method it uses  == operator
	//	System.out.println(same);
		
		//////////////////////// String literals //////////////////////////////
		
		String movie ="Juarrasic Park";    // these String literals are stored in a separate memory called String pool - here all string literals are unique
		String novel ="Juarrasic Park";
		String comic = "Jurrasic Park";
		
		same = movie == novel;
		System.out.println(same);
		
		same = movie.equals(novel);
		System.out.println(same);
		
		// String Objects,  String literals and other Objects like A, Rectangle, Employee
		
		System.out.println("HELLO".toLowerCase());
		
		A a = new A(10);
		B b = new B(10);
		same = a.equals(b);
		
		System.out.println("a b "+ same);
	//	same = a == b;
	}

}
