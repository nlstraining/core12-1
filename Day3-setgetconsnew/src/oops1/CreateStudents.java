package oops1;

public class CreateStudents {

	public static void main(String[] args) {
		
		Student tom = new Student();  // creating object - instantiation 
		
		//       new is an operator in java 
		//     1 . allocate memory for the object of given class
		//     2. copy the data members into the object 
		//     3. call the constructor to initialize the data members
		//     4. return the reference of newly created objected to LHS
		
	//	tom.id=1;    // initializing the data members 15
	//	tom.classId="7-A";
	//	tom.name="Thomas";
	
		System.out.println(tom.getId());  // reading the data and printing 
		System.out.println(tom.getClassId());
		System.out.println(tom.getName());
		
		
		tom.setId(1);
		tom.setClassId("7-A");
		tom.setName("Thomas");
		
		
		System.out.println(tom.getId());  // reading the data and printing 
		System.out.println(tom.getClassId());
		System.out.println(tom.getName());
		
		
	/*	Student shiny = new Student();
		shiny.id= 2;
		shiny.classId="7-A";
		shiny.name="Shiny";
		shiny.gender="female";
		
		System.out.println(shiny.id);
		System.out.println(shiny.classId);
		System.out.println(shiny.name);
		System.out.println(shiny.gender);*/
	
		Student shiny = new Student(2,"7-A","Sh0ny");
		System.out.println(shiny.getId());  // reading the data and printing 
		System.out.println(shiny.getClassId());
		System.out.println(shiny.getName());
		shiny.setName("Shiny");
		System.out.println(shiny.getName());
		
	}

}
