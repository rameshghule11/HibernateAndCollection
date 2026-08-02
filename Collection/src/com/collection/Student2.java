package com.collection;

public class Student2 {

	 private int id;
	 private  String name;
	 private double marks;
	 private String dep;
	 private String gender;
	
	 public Student2(int id, String name, double marks, String dep,String gender) {
		 
		 this.id=id;
		 this.name=name;
		 this.marks=marks;
		 this.dep=dep;
		 this.gender=gender; 
	 }
	 
	 public int getId() {
		 return id;
	 }
	 public void setId(int id) {
		 this.id=id;
	 }
	 public String getName() {
		 return name;
	 }
	 public void setName(String name) {
		 this.name=name;
	 }
	 public double getMarks() {
		 return marks;
	 }
	 public void setMarks(double marks) {
		 this.marks=marks;
	 }
	 public String getGender() {
		 return gender;
	 }
	 public void setGender(String gender) {
		 this.gender=gender;
	 }
	 public String getDep() {
		 return dep;
	 }
	 public void setDep(String dep) {
		 this.dep=dep;
	 }

	 @Override
	 public String toString() {
		return "Student2 [id=" + id + ", name=" + name + ", marks=" + marks + ", dep=" + dep + ", gender=" + gender
				+ "]";
	 }
	 
	 
	 
	 
}

