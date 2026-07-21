package com.collection;

import java.util.ArrayList;

public class Demo {

	public static void main(String args [] ) {
		
		ArrayList<String> al=new ArrayList<String>();
		
			al.add("Banti");
			al.add("Dnyanu");
			al.add("kalu");
			al.add("ash");
			
			ArrayList<String> al2=new ArrayList<String>();
			
			al.add("Baby");
			al.add("Danger");
			al.add("kaliya");
			al.add("ashwini");
			
			al.addAll(al2);
			System.out.println("All Values : "+al);
			
			ArrayList<Float> fl=new  ArrayList <Float>();
			
			fl.add(12.2f);
			fl.add(13.4f);
			fl.add(99.0f);
			fl.add(95.99f);
			
			System.out.println("Float Value:" +fl);
			
//			System.out.println(al.isEmpty( ));
//			System.out.println(al.lastIndexOf("ash"));
//			System.out.println(al.remove(1));
			
			 
	}
}
