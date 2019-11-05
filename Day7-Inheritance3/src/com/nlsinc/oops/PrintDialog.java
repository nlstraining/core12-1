package com.nlsinc.oops;

public class PrintDialog extends Window {

	private int pageSize;
	private int noOfCopies;
	private int noOfPages;
	
	

	public PrintDialog(int pageSize, int noOfCopies, int noOfPages, int width, int height, int x, int y) {
		super(width,height,x,y);
		this.pageSize = pageSize;
		this.noOfCopies = noOfCopies;
		this.noOfPages= noOfPages;
		
		
	}
	
	@Override  // rules method access scope shoule be same or wider
	                // return type should be same
	              // parameters should be same : the no of params, order of params and types of params
	public boolean open() {
		 System.out.println("Open in the center ....");
		return true;
	};
	


@Override  // Annotation 
	// default --> protected and public
	// protected --> public
	// public should remain public only
	public String toString() {
		return "PrintDialog [pageSize=" + pageSize + ", noOfCopies="
				+ noOfCopies + ", noOfPages=" + noOfPages + "]" + super.toString();
	}
	
	
}
