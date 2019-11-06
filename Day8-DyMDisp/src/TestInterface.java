
public class TestInterface {

	public static void main(String[] args) {
		
		//ShapeIface s = new ShapeIface(); cannot instantiate
		
		ShapeIface s = null;
	
		 s = new RectangleImpl();
		 System.out.println(s.area());
	}

}
