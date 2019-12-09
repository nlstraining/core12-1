package com.nlsinc.traing;

//object oriented software we take only relevant object identification properties which
//we can see and experience 
public class Student{// implements Comparable { // defined a class // 50

	// data members state instance variables or fields

	private int id; // visible = scope only in the same class
	private String classId;
	private String name;

	public Student(int id, String classId, String name) {
		this.id = id;
		this.classId = classId;
		this.name = name;

	}

	public Student() {
		System.out.println("from Student() default constructor.....");
		System.out.println(id);
		System.out.println(classId);
		System.out.println(name);
	}

	public int getId() { // select or fetch
		return id;
	}

	public void setId(int id) { // / insert and or update also for encapsulating
		this.id = id;
	}

	public String getClassId() {
		return classId;
	}

	public void setClassId(String classId) {
		this.classId = classId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", classId=" + classId + ", name=" + name
				+ "]";
	}

	@Override
	public boolean equals(Object arg0) {
		Student arg = (Student) arg0;
		if (this.id == arg.getId())
			return true;
		else
			return false;
	}

	@Override
	public int hashCode() {

		return this.id * 32 * 16 * 8; // 1 * 32 * 16 * 8 = 8192 2 * 32 * 16 * 8
										// = 16284
	}

/*	@Override
	public int compareTo(Object arg0) {  // it is helping TreeSet to order objects
		Student arg = (Student) arg0;
		if (this.id < arg.getId())
			return -1;
		else if (this.id == arg.getId())
			return 0;
		else
			return 1;
	}*/

}
