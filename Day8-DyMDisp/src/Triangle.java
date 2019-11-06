
public class Triangle extends Shape {

	  private double base;
	  private double height;
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}
	
	public double area(){
		
		  return 1.0/2.0 * base * height;
	}
	
	@Override
	public String toString() {
		return "Triangle [base=" + base + ", height=" + height + "]";
	}
	  
	  
	  
}
