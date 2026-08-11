package com.map;


import java.util.HashMap;
import java.util.Hashtable;
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

	        System.out.println("LHM: "+map);
	
	
	TreeMap<String,String> tre=new TreeMap<String,String>();
	
	tre.put("banti","javaDevloper");
	tre.put("kalpesh","Teacher");
	tre.put("Banti","Gamer");
	tre.put("Banti","vloger");
	System.out.println("TreeM: "+tre);
	
	
	TreeMap<String,String> trm=new TreeMap<String,String>();
	trm.put("Snax","Gamer");
	trm.put("mavi","IGL");
	trm.put("Jonthan","Goat");
	trm.put("Goblin","Asulter");
	trm.put("ShreeMaan","All Rounder");
	trm.put("Banti","Legend");
	
	System.out.println("TreeMap: "+trm);
	
	
	
	Hashtable<String,String> tb=new Hashtable<String,String>();
	
	tb.put("banti","javaDevloper");
	tb.put("kalpesh","Teacher");
	tb.put("Banti","Gamer");
	tb.put("Banti","vloger");
	
	System.out.println("Hashtable: "+tb);
	
	Hashtable<String,Integer> ht=new Hashtable<String,Integer>();
	
	ht.put("value", 20);
	ht.put("price", 20);
	ht.put("Value", 20);
	ht.put("Price", 20);
	
	System.out.println("Values: "+ht);

	Hashtable<String,String> htb=new Hashtable<String,String>();
	htb.put("Ash","Pikachu");
	htb.put("Jinhu","Hunter");
	htb.put("Nobita","Doremon");
	htb.put("Elie","Slug");
	
	System.out.println("Table: "+htb);
	
	}
	
	
	
	
	
}
