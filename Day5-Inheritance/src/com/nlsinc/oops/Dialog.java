package com.nlsinc.oops;

public class Dialog  extends Window{

	 private boolean mode;
	
	
	public Dialog(double w, double h) {
	      // how a subclass talks to super class?
		super(w, h); // chaining or linking to super class constructor from subclass
	}

	public Dialog(double w, double h, int x, int y) {
	//   System.out.println("jhkjhkhkjhk");
		super(w,h,x,y);  // always immediate super class 
		// A <-- B <-- C <-- D
		// always provide or make sure the super class has relevant constructor
		// with equal no parameter passed through super(......)
		// this call to super() should be on the first line of the subclass constructor
	
	}
	public void setDialogMode(boolean modal){
		
		this.mode = modal;
		
	}
	
	

}
