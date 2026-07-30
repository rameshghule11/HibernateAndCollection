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
	
	System.out.println("==============================================================================");
	
	
	ArrayList<Employee> emp=new ArrayList<Employee>();

	emp.add(	new Employee(1,"Banti","India",54000,"It","Male"));
	emp.add(	new Employee(2,"kalu","Pune",54000,"It","Female"));
	emp.add(	new Employee(2,"Dnyanu","jkd",54000,"It","female"));
	emp.add(	new Employee(4,"Ash","Palet",54000,"It","Male"));
	
	
	for(Employee E:emp) {
		System.out.println(E);
	}
	
	System.out.println("====================================================================");
	
	for(Employee e:emp) {
		if(e.getName().equals("kalu"))
			System.out.println(e);
	}
	
	ArrayList<User> use=new ArrayList<User>();
	
	use.add(new User(1,"Banti","rameshghule112002@gmail.com"));
	use.add(new User(2,"Dnyanu","dnyaneshwarijaybhai2005@gmail.com"));
	use.add(new User(3,"motapatlu","motapatlu1001@gmail.com"));
	use.add(new User(4,"khadus","khadus1001@gmail.com"));
	
	
	for(User u:use) {
		
		System.out.println("User: "+u);
	}
	
    }
 }
