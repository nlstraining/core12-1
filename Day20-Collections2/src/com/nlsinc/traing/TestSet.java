package com.nlsinc.traing;

import java.util.HashSet;
import java.util.Iterator;

public class TestSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //  Set of unique objects
		// we don't have to verify the uniqueness, it should be authentic
		// insertion order is not retained - elements will not have a position
	// Set implementations - HashSet, TreeSet
		
		HashSet<String> rainbow = new HashSet<>();
		/*rainbow.add(new Integer("10"));
		rainbow.add("ten");
		rainbow.add(new Double("22.22222"));
		rainbow.add(new StringBuffer("Hello"));*/
		rainbow.add("Orange");
		rainbow.add("Green");
		rainbow.add("Violate");
		rainbow.add("Red");
		rainbow.add("Blue");
		rainbow.add("Yellow");
	//	System.out.println(rainbow.size());
		rainbow.add("Red");
//		System.out.println(rainbow.size());
		rainbow.add(null);
		System.out.println(rainbow.size());
		rainbow.add(null); // null too is unique  
		//System.out.println(rainbow.size());
		
		System.out.println(rainbow.contains("Green"));
		System.out.println(rainbow);
		rainbow.remove(null);
		System.out.println(rainbow);
//		String str = new Object();
		for(String color : rainbow){
			
			 //System.out.println(color);
		}
		
		Iterator<String> iter = rainbow.iterator();
		while(iter.hasNext()){
			
			 System.out.println(iter.next());
		}
	}

}
