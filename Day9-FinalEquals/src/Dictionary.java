
final public class Dictionary  {

}

class OxfordDictionary extends Dictionary{
	
}

class A{
	
	 final void m(){}
} 

class B extends A{
	
	 void m(){}
}

class Test{
 
	 public static void main(String[] args) {
	
		  final int i;
		  i = 20;
		 i=50;  
		 final Dictionary d;
		 d = new Dictionary();
		 d = d;
		 
		final  Dictionary dict = new Dictionary();
		  dict = new Dictionary();
	}
}

class Parent{ // static {belongs to class} or non-static {belongs to object}
	                 
	 static void m(){}   // static members of a classs belong to the class and not to the object 
	
	static void m1(){}
}
class Child extends Parent{
	
	    static void m(){}
	   // void m(){}
	     void m2(){
	    	 
	    	 m1();
	     }
}

