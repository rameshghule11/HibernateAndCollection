package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

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
			
			 for(int i=0;i<al.size();i++) {
				 System.out.println("Using for Loop: "+al.get(i));
			 }
			 
			 for(String s:al) {
				 System.out.println("Using ForEach: "+s);
			 }
			 
			 Iterator<String> itr=al.iterator();
			 while(itr.hasNext()) {
				 System.out.println("Using iterator: "+itr.next());
			 }
			 
			 Iterator<Float> itr1=fl.iterator();
			 while(itr1.hasNext()) {
				 System.out.println("Using Float itr: "+itr1.next());
			 }
			 
			 
			 ListIterator<String> itr3= al.listIterator();
			 while(itr3.hasNext()) {
				 System.out.println("UseList: "+itr3.next());
			 }
			 
			 System.out.println("=========================================================");
			 
			
			 while(itr3.hasPrevious())
			 {
				 System.out.println("UseListPrevious: "+itr3.previous());
			 }
			 
			 ArrayList<String> ar=new ArrayList<String>();
			
			 ar.add("Banti");
			 ar.add("Hello");
			 ar.add("Ramesh");
			 ar.add("Jinhu");
			 ar.add("Ash");
			 
			 Iterator<String>it=ar.iterator();
			 while(it.hasNext()) {
				 System.out.println("Arr It: +"+it.next());
			 }
			// System.out.println(ar);
			 
			 ArrayList<Student3>student=new ArrayList<Student3>();
			 
	}
}
