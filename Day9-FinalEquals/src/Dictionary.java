
<<<<<<< HEAD

//final
public class Dictionary  {
=======
final public class Dictionary  {
>>>>>>> 130ff7ed5a0b48a16cbef3e3b10e1f0f96e9079e

}

class OxfordDictionary extends Dictionary{
	
}

class A{
	
<<<<<<< HEAD
	 //final 
	 void m(){}
=======
	 final void m(){}
>>>>>>> 130ff7ed5a0b48a16cbef3e3b10e1f0f96e9079e
} 

class B extends A{
	
	 void m(){}
}

class Test{
 
	 public static void main(String[] args) {
	
<<<<<<< HEAD
		  //final
		  int i;
		  i = 20;
		 i=50;  
		 //final 
		 Dictionary d;
=======
		  final int i;
		  i = 20;
		 i=50;  
		 final Dictionary d;
>>>>>>> 130ff7ed5a0b48a16cbef3e3b10e1f0f96e9079e
		 d = new Dictionary();
		 d = d;
		 
		final  Dictionary dict = new Dictionary();
<<<<<<< HEAD
	//	  dict = new Dictionary();
=======
		  dict = new Dictionary();
>>>>>>> 130ff7ed5a0b48a16cbef3e3b10e1f0f96e9079e
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

