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
		
		ListIterator<Integer> itr=list.listIterator();
		
		while(itr.hasNext()) {
			System.out.println("List :"+ itr.next());
		}
		
	}
}
