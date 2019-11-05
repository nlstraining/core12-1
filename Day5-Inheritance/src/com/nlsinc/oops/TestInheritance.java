package com.nlsinc.oops;

public class TestInheritance {

	public static void main(String[] args) {

		  Dialog d = new Dialog(125.00, 50.00);
		  
		  
		  
		  System.out.println(d.getHeight());
		  System.out.println(d.getWidth());
		  
		  Dialog saveDialog = new Dialog(100.00,100.00, 250,50); 
		  saveDialog.setDialogMode(true);
		  System.out.println(saveDialog.getHeight());
		  System.out.println(saveDialog.getWidth());
		  System.out.println(saveDialog.getX());
		  System.out.println(saveDialog.getY());
		  
		  
		  
		  
		  
	}

}
