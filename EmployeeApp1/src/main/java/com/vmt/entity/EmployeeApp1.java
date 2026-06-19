package com.vmt.entity;

import jakarta.persistence.Entity;


@Entity
public class EmployeeApp1 {
    
	
	private int EmpId;
	private String name;
	private double salary;
	private String dep;
	private String gender;
	public EmployeeApp1(int empId, String name, double salary, String dep, String gender) {
		super();
		EmpId = empId;
		this.name = name;
		this.salary = salary;
		this.dep = dep;
		this.gender = gender;
	}
	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int empId) {
		EmpId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
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
	
	
	
	
}
