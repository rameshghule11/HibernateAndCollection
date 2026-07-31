package com.collection;

public class Student1 {

	private int id;
	private double marks;
	private String name;
	private String dep;
	private String  gender;
	public Student1(int id, double marks, String name, String dep, String gender) {
		super();
		this.id = id;
		this.marks = marks;
		this.name = name;
		this.dep = dep;
		this.gender = gender;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDep() {
		return dep;
	}
	public void setDep(String dep) {
		this.dep = dep;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Student1 [id=" + id + ", marks=" + marks + ", name=" + name + ", dep=" + dep + ", gender=" + gender
				+ "]";
	}
	
	
	
}
