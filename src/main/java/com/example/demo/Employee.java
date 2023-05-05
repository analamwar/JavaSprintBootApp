package com.example.demo;

public class Employee {

	
	private int employeeId;
	private String employeeAddress;
	private int employeExperience;
	
	
	public Employee(int employeeId, String employeeAddress, int employeExperience) {
		super();
		this.employeeId = employeeId;
		this.employeeAddress = employeeAddress;
		this.employeExperience = employeExperience;
	}
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeAddress() {
		return employeeAddress;
	}
	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}
	public int getEmployeExperience() {
		return employeExperience;
	}
	public void setEmployeExperience(int employeExperience) {
		this.employeExperience = employeExperience;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeAddress=" + employeeAddress + ", employeExperience="
				+ employeExperience + "]";
	}
}
