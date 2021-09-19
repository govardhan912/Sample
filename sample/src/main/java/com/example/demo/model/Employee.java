package com.example.demo.model;

public class Employee {

	private String name;
	private String designation;
	private int PF;
	private double salary;
	private double monthly;
	
	public Employee() {
		
	}
	
	public Employee(String name, String designation, int pF, double salary, double monthly) {
	
		this.name = name;
		this.designation = designation;
		PF = pF;
		this.salary = salary;
		this.monthly = monthly;
		
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getPF() {
		return PF;
	}

	public void setPF(int pF) {
		PF = pF;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getMonthly() {
		return monthly;
	}

	public void setMonthly(double monthly) {
		this.monthly = monthly;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", designation=" + designation + ", PF=" + PF + ", salary=" + salary
				+ ", monthly=" + monthly + "]";
	}
	
	
	
   
	
	
}
