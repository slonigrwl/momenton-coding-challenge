package com.company.core;

public class Employee {

	public String employeeName;
	public int employeeId;
	public int managerId;
	public int level;

	Employee(int empId, String name, int managerId) {

		this.employeeName = name;
		this.employeeId = empId;
		this.managerId = managerId;

	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public int getManagerId() {
		return managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

}
