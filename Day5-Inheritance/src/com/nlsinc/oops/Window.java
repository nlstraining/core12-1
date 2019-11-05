package com.nlsinc.oops;
//1. instantiate and use - student borrows a book from lib and reads and returns 
// 2. extend and use -  it means  - inherit and re-use 
// inheritance says - do not invent wheel 
//3. you will define the new behavior in subclass
public class Window{

	 private double width;  // available only within same class
	private double height;
	private double x;  
	double y;
	
	
	public Window() {
	System.out.println("from Window() default constructor");
	}
	
	
	public Window(double width, double height, double x, double y) {

		this.width = width;
		this.height = height;
		this.x = x;
		this.y = y;
	}


	public Window(double w, double h) {
		this.width =w ;
		this.height =h;
	}


	public double getWidth() {
		return width;
	}


	public void setWidth(double width) {
		this.width = width;
	}


	public double getHeight() {
		return height;
	}


	public void setHeight(double height) {
		this.height = height;
	}


	public double getX() {
		return x;
	}


	public void setX(double x) {
		this.x = x;
	}


	public double getY() {
		return y;
	}


	public void setY(double y) {
		this.y = y;
	}


	public boolean open(){
		System.out.println("Opening window");
		return true;
	}
	public boolean close(){
		
		System.out.println("Closing window");
		return true;
		
	}
	public boolean resize(){
		
		System.out.println("Resize window");
		return true;
	}
}
