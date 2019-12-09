package com.nlsinc.traing;

import java.util.HashSet;
import java.util.TreeSet;

public class TestTreeSet {

	public static void main(String[] args) {
		/*TreeSet<String> rainbow = new TreeSet<>();
	
		rainbow.add("Orange");
		rainbow.add("Green");
		rainbow.add("Violate");
		rainbow.add("Red");
		rainbow.add("Blue");
		rainbow.add("Yellow");
	//	System.out.println(rainbow.size());
		rainbow.add("Red");
//		System.out.println(rainbow.size());
		//rainbow.add(null);
		System.out.println(rainbow);
*/
		
		Student student1 = new Student(1,"9","Emma"); // ==  id == id2
		Student student2 = new Student(2,"9","Betty");
		Student student3 = new Student(3, "9", "Jennifer");
		Student student4 = new Student(3, "9", "Jennifer");
		Student student5 = new Student(0, "9", "Kim");
		TreeSet<Student> studentSet = new TreeSet<>(new StudentComparator());
		// select * from emp order by name;
		
		studentSet.add(student1);
		studentSet.add(student2);
		studentSet.add(student3);
		studentSet.add(student4);
		studentSet.add(student5);
		System.out.println(studentSet);
		
		
	}

}
