package oops1;

public class CreateStudents {

	public static void main(String[] args) {
		
		Student tom = new Student();  // creating object - instantiation 35
		
		tom.id=1;    // initializing the data members 15
		tom.classId="7-A";
		tom.name="Thomas";
		tom.gender="male";
		
		System.out.println(tom.id);  // reading the data and printing 
		System.out.println(tom.classId);
		System.out.println(tom.name);
		System.out.println(tom.gender);
		
		Student shiny = new Student();
		shiny.id= 2;
		shiny.classId="7-A";
		shiny.name="Shiny";
		shiny.gender="female";
		
		System.out.println(shiny.id);
		System.out.println(shiny.classId);
		System.out.println(shiny.name);
		System.out.println(shiny.gender);
	
	}

}
