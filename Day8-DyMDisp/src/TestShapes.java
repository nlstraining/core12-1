
public class TestShapes {

	public static void main(String[] args) {
	
	/*	 Shape s = new Shape();
		// System.out.println(s.area());
		 
		 Rectangle rect = new Rectangle(25.75,75.25);
       //System.out.println(rect.area());		
       
       Triangle tr = new Triangle(48.9,98.23);
       //System.out.println(tr.area()); // the method resolution happens at compile time
       // when the object and its class are same - early binding 
       
    */ 
       
		Shape s = null;
		
	//	 System.out.println(s.area()); Exception in thread "main" java.lang.NullPointerException
		
		 s = new Rectangle(25.75,75.25);
		 System.out.println(s.area());  // dynamic method dispatch is also known as late binding 
		 
		 s = new Triangle(48.9,98.23); // up-casting is welcomed by Java
		 System.out.println(s.area()); 
		 
		 // polymorphism:  swipe the cards 
		 //1. there should be inheritance
		 //2. there should be overriding
		 //3. there should super reference and sub-class object
		 //4. there should be method invocation the common method
       
	//	 Rectangle r  = new Shape();  // down-casting is not implicit
		 // super class reference cannot be assigned to sub class 
		 // super class is wider and sub class is narrower
		  int i=340;
		// byte b = i;
		 
	}

}
