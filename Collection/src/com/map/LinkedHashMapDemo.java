package com.map;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
public class LinkedHashMapDemo {

	public static void main(String[] args) {
		

		 LinkedHashMap<String, String> map = new LinkedHashMap<>();

	        map.put("Ramesh", "Java Developer");
	        map.put("Amit", "Teacher");
	        map.put("Rahul", "Engineer");

	        System.out.println(map);
	
	
	TreeMap<String,String> tre=new TreeMap<String,String>();
	
	tre.put("banti","javaDevloper");
	tre.put("kalpesh","Teacher");
	tre.put("Banti","Gamer");
	tre.put("Banti","vloger");
	System.out.println(tre);
	}
}
