package com.collection;

public class Employee {

	
	private int empId;
	private String name;
	private String address;
	private double salary;
	private String dep;
	private String gender;
	
	
	
	
	public Employee(int empId, String name, String address, double salary, String dep, String gender) {
		super();
		this.empId = empId;
		this.name = name;
		this.address = address;
		this.salary = salary;
		this.dep = dep;
		this.gender = gender;
	}
	
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", address=" + address + ", salary=" + salary + ", dep="
				+ dep + ", gender=" + gender + "]";
	}


	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
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
