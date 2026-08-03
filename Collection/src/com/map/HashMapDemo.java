package com.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		
		/*
		Map is an Interface which is prsent in java.util 
		map is used to store data in key-value pairs
		map Provides 4 impliments classes 
		1HashMap
		2Linkedhashmap
		3TreeMap
		4HashTable
		
		HashMap is an implimented class of map Interface wich is prsent in java.util.package
		hashMap Store the data in form key-value pairs 
		 -- Each key-value pairs is known as an Entery
		 Syntax:- HasMap<datatype,DataType> map=new HashMap<datatype,datatype>();
		 Syntax:- HasMap<key,Value> map=new HashMap<Key, Value();
		HashMap can Contain duplicate values 
		HashMap can not contain duplicate key values
		 if we make key duplicate it will remove Existing Records 
		HashMap can not followed Insertion order
		HashMap can contain multiple null values 
		HashMap can contain Single null key only
		
		*/
		
		HashMap<String, String> map=new HashMap<String,String>();
		
		map.put("banti","javaDevloper");
		map.put("kalpesh","Teacher");
		map.put("Banti","Gamer");
		map.put("Banti","vloger");
		
		//System.out.println(map);
		
		//HashMap Methods - same -> LinkedHashMap, TreeMap,HashTable 
		
		// System.out.println(map.size());--> to check Size of Map Duplicate is not  allow not add duplicate values 
		//System.out.println(map.keySet()); --> to get  only key from map 
		//System.out.println(map.values());-->to get  only values from map
		//	System.out.println(map.isEmpty()); //to check map is empty or not 
		//map.clear();//--> to remove all entries form map
		//System.out.println(map.get("Banti"));--> give the key get the value 
		//System.out.println(map.remove("kalpesh"));give the key And remove key and  value
		//System.out.println(map);
		//map.replace("kalpesh","javaDevloper"); use to replace And Update Values
		//System.out.println(map);
		//System.out.println(map.containsKey("Banti"));--> to Check key is Prsent or not 
		//System.out.println(map.containsValue("javaDevloper"));--> to Check value is Avlable or not
		
		//Alt + Shift + L to get the return type
		Set<Entry<String, String>> entrySet = map.entrySet();
		
		// This is way to Iterate to HashMap.
		for(Entry<String, String> data:entrySet) {
			System.out.println(data.getKey()+"= "+data.getValue());
			
		}
		
LinkedHashMap<String, String> map1=new LinkedHashMap<String,String>();
		
		map1.put("banti","javaDevloper");
		map1.put("kalpesh","Teacher");
		map1.put("Banti","Gamer");
		map1.put("Banti","vloger");
		
		System.out.println("Linked Hash Map: "+map1);
	}
}
