package com.nlsinc.training;

import java.util.ArrayList;

public class TestCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // why the word collections is used? - 
		//1. in java everything is an object
		//2. where do you store them?
		// a collection of shoes, shirts, cds, books 
      // Joshua Bloch
		
		String fruits[] = new String[5];
		fruits[0] =  new String("Mango");
		fruits[1] = "Apple";
		fruits[2] = "Orange";
		fruits[3] = "Melon";
		fruits[4] = "Grapes";
		
	 System.out.println(fruits);
		
/*		for(int i=0 ; i<fruits.length;i++){
			System.out.println(fruits[i]);
		}
*/		
	     // Lists permit duplicate elements
		
		 ArrayList<String>  fruitList = new ArrayList<>();
		 fruitList.add("Mango");
		 fruitList.add("Orange");
		 fruitList.add("apple");
		 fruitList.add("Blue berry");
		 fruitList.add("Grapes");
		 fruitList.add("Leach");

		 System.out.println(fruitList);
		 class A{
			 
			 
		 }
		  
		  A a[] = new A[5];
		 
		  for( Object o : a){
			  
			  System.out.println(o);
		  }
		 for(Object fruit: fruitList){  // enhanced for loop : the ArrayList must implment Iterable Interface
			 
			 System.out.println(fruit);
		 }
		 System.out.println(fruitList.contains("Mangoose"));
		 System.out.println(fruitList.get(0));
		 int index = fruitList.indexOf("Orange");
		 System.out.println(index);
	}

}
