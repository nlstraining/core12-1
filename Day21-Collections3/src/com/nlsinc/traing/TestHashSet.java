package com.nlsinc.traing;

import java.util.HashSet;

public class TestHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student student1 = new Student(1,"9","Emma"); // ==  id == id2
		Student student2 = new Student(2,"9","Betty");
		Student student3 = new Student(3, "9", "Jennifer");
		Student student4 = new Student(3, "9", "Jennifer");
		HashSet<Student> studentSet = new HashSet<>();
		
		studentSet.add(student1);
		studentSet.add(student2);
		studentSet.add(student3);
		studentSet.add(student4);
		
		
		System.out.println(studentSet);
		System.out.println(studentSet.size());
		student4 = new Student(4, "9", "Jennifer");
		studentSet.add(student4);
		System.out.println(studentSet.size());
		System.out.println(studentSet);
	}

}
