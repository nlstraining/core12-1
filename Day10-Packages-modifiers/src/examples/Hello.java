//1 a comment
/*
 * this
 * is 
   a 
   comment
 */

package examples; // only  zero or one is allowed 
//package test;
import java.io.*; // load the java libraries -  0 or more 
import java.net.*;
///
// class Test2{} note allowed
import java.util.*;
class Test{
	
	void m(){
		  Hello h = new Hello();
		   h.defaultData = 20;
		   h.protData = 30;
		   h.pubData = 40;
		   
		   
	}
}
interface Shape{}
// only one public class/interface/enum per .java file
public  class Hello{
	/*
	1.  comments
	2.  data members 
	3. class data members
	4. methods   
	5. constructors
	6. classes
	7. interfaces
	8. enums
	9. anonymous blocks  - static and non-static or instance blocks
	*/
	private int data; // with in same class 
	 int defaultData; // a default member access, only to sub-classes
	                           	// same class and only sub classes within the same package
	protected int protData;
	public int pubData;
}
 class Hello2 extends Hello {
	{
		//data = 10;
		defaultData = 10;
		protData = 30;
		pubData = 40;
	} 
	
}

//class tEst{}