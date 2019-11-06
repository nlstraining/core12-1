//1 super class is non-abstract - class
//2 super class is abstract  - for partial abstraction
// 3. super (class) type  is interface  - complete abstraction - preferred
public class TestAbstract {

	public static void main(String[] args) {
		
		
	//	Shape2 s = new Shape2(); cannot instantiate
		
		Shape2 s = null;
		
		s = new Rectangle2(123.123,87.98);
		System.out.println(s.area());
		
		s = new Triangle2(54.54,88.88);
		System.out.println(s.area());
		
	}

}
