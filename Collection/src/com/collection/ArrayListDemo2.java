package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo2 {
public static void main(String[] args) {
	
	Student s1=new Student();
	s1.setId(1);
	s1.setName("banti");
	s1.setAddress("pune");
	
	Student s2=new Student();
	s2.setId(2);
	s2.setName("Ash");
	s2.setAddress("PaletTown");
	
	Student s3=new Student();
	s3.setId(3);
	s3.setName("Bheem");
	s3.setAddress("DholkPoor");
	
	Student s4=new Student();
	s4.setId(4);
	s4.setName("jinhu");
	s4.setAddress("Japan");
	
	Student s5=new Student();
	s5.setId(5);
	s5.setName("pamya");
	s5.setAddress("jamkhed");
	
	ArrayList<Student> al=new ArrayList<Student>();
	
	al.add(s1);
	al.add(s2);
	al.add(s3);
	al.add(s4);
	al.add(s5);
	
	for(int i=0;i<al.size();i++) {
		System.out.println("ForLoop: "+al.get(i));
	}
	
	System.out.println("===========================================================================");
	for(Student s:al) {
		System.out.println("For EachLopp : "+s);
	}
	
	System.out.println("===========================================================================");
	Iterator<Student> itr=al.iterator();
	
	while(itr.hasNext()) {
		System.out.println("UseIterator: "+itr.next());
	}
	
	System.out.println("==============================================================================");
	
	ListIterator<Student> itr1=al.listIterator();
	while(itr1.hasNext()) {
		System.out.println("ListIterator: "+itr1.next());
	}
	
	
    }
 }
