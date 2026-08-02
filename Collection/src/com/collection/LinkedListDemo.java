package com.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList<Integer> list=new LinkedList<Integer>();
		list.add(12);
		list.add(21);
		list.add(25);
		list.add(57);
		
		// ListIterator<Integer> itr=list.listIterator();
		Iterator<Integer> itr=list.iterator();
		
		while(itr.hasNext()) {
			System.out.println("List :"+ itr.next());
		}
		
		
		LinkedList<String>list1=new LinkedList<String>();
		list1.add("banti");
		list1.add("milind");
		list1.add("amar");
		list1.add("kalu");
		
		System.out.println("name: "+list1);
		
		//ListIterator<String> itrs=list1.listIterator();
//		Iterator<String> itrs=list1.iterator();
//		while(itrs.hasNext()) {
//			System.out.println("List2: "+itrs.next());
//		}
		
		LinkedList<String>list2=new LinkedList<String>();
		list2.add("banti");
		list2.add("Ramesh");
		list2.add("Ash");
		list2.add("Doremon");
		list2.add("Pikachu");
		
		Iterator<String>itr2=list2.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		
		ListIterator<String>itr3=list2.listIterator();
		while(itr3.hasNext()) {
			System.out.println("NewList: "+itr3.next());
		}
		
		
		LinkedList<String>list4=new LinkedList<String>();
		
		list4.add("Banti");
		list4.add("Doremon");
		list4.add("Sunio");
		list4.add("Jiyan");
		list4.add("Shijuka");
		list4.add("Dekysugi");
		
		Iterator<String>itr4=list4.iterator();
		while(itr4.hasNext()) {
			System.out.println("List: "+itr4.next());
		}
		
		
		LinkedList<Student2>stud=new LinkedList<Student2>();
		stud.add(new Student2(1,"banti",99,"It","male"));
		stud.add(new Student2(1,"banti",99,"It","male"));
		stud.add(new Student2(1,"banti",99,"It","male"));
		stud.add(new Student2(1,"banti",99,"It","male"));
		stud.add(new Student2(1,"banti",99,"It","male"));
		stud.add(new Student2(1,"banti",99,"It","male"));
		Iterator<Student2>itr5=stud.iterator();
		while(itr5.hasNext()) {
			System.out.println("Stud: "+ itr5.next());
		}
	
		
	}
}
