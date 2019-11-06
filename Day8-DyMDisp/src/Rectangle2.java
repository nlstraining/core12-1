
public class Rectangle2 extends Shape2 {

	private double length;
	private double breadth;
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getBreadth() {
		return breadth;
	}
	public Rectangle2(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}
	
	 
	
	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", breadth=" + breadth + "]";
	}
	@Override
	public double area() {
		
		return this.length * this.breadth;
	}
	
	
	
}
