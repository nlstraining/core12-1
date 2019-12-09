package com.nlsinc.training;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class TestDeserialization {

	public static void main(String[] args)  throws Exception{
	
		ObjectInputStream ois = 
				new ObjectInputStream(
						new FileInputStream("C:\\Users\\Anil\\workspace\\night12_1\\Day18-IOSerialization\\emp.dat"));
      // during serialization an object is type promoted... to Object class instance
		Object obj = ois.readObject();
		//obj.
		//System.out.println(obj);
		          Employee emp =  (Employee)  obj;  // this is not pure inheritance 
		          System.out.println(emp.getEmpno() + "......"+ emp.getEname());
		      /*    Employee emp1  = new Employee(2,"");
		          Object obj2 = (Employee) emp1; // this statement is redundant in Java as upcasting/widening is implicit
		          Object obj3 = emp1;
		          Employee emp2 = obj3; // not allowed - narrowing, hence needs explicit cast in Java
*/		          
		          
	}

}
