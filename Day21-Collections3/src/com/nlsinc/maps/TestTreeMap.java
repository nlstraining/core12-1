package com.nlsinc.maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TestTreeMap {

	public static void main(String[] args) {

		// list is index based data[0] = data at 0 index
		// set - does not allow access
		// Maps - for every element you have a key and a value

		TreeMap<String, String> countryCityMap = new TreeMap<>();

		countryCityMap.put("Turkey", "Istanbul");
		countryCityMap.put("Switerzland", "Geneva");
		countryCityMap.put("USA", "Washington DC");
		countryCityMap.put("Kazakhstan", "Astana");
		countryCityMap.put("India", "New Delhi");

		

		System.out.println(countryCityMap); // all key values 1. view
		// 2 view = the view of all values

		Collection<String> cities = countryCityMap.values();
		System.out.println(cities);
		// 3 view the view of all keys

		Set<String> keySet = countryCityMap.keySet();
		System.out.println(keySet);
		// 4 view both key and values together

		Set<Entry<String, String>> keyValSet = countryCityMap.entrySet();
		System.out.println(keyValSet);
		/*
		 * Iterator<Entry<String,String>> iter = keyValSet.iterator();
		 * while(iter.hasNext()){
		 * 
		 * Entry entry = iter.next(); System.out.println(entry.getKey() + " : "
		 * + entry.getValue());
		 * 
		 * }
		 */
		for (Entry<String, String> entry : keyValSet) {

			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

	}

}
