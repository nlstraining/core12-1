package com.nlsinc.maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class TestAlgos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         ArrayList<Integer> nums = new ArrayList<>();
         nums.add(10);
         nums.add(88888);
         nums.add(7878);
	Collections.sort(nums);
	  System.out.println(nums);
	  System.out.println(Collections.binarySearch(nums, 88888));
	  
	  int marks[] = {34,23,24,98,76};
	  Arrays.sort(marks);
	  for(int i : marks){
	  System.out.println(i);
	  }
	}

}
