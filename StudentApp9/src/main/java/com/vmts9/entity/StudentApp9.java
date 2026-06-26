package com.vmts9.entity;

public class StudentApp9 {

	private int id;
	private String name;
	private double marks;
	private String gender;
	
	public StudentApp9(int id,String name,double marks,String gender) {
		
		this.id=id;
		this.name=name;
		this.marks=marks;
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
}
