package com.map;

import java.util.HashMap;

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
		
		System.out.println(map);
		
	}
}
