package oops1;
// object oriented software we take only relevant object identification properties which
// we can see and experience 
public class Student {  // defined a class // 50

	// data members  state instance variables or fields 
	
	   private int  id;  // visible = scope only in the same class 
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
	public void setId(int id) {  /// insert and or update also for encapsulating
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
	
	
	
	
	   
	   
	   
	   
	   
}
