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
		
		Iterator<String>itr2=list2.descendingIterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		
	}
}
