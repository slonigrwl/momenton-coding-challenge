package com.company.core;

import java.util.ArrayList;

public class Staff {

	private ArrayList<Employee> employees;

	public Staff() {

		employees = new ArrayList<Employee>();
		employees.add(new Employee(100, "Alan", 150));
		employees.add(new Employee(220, "Martin", 100));
		employees.add(new Employee(150, "Jamie", 0));
		employees.add(new Employee(275, "Alex", 100));
		employees.add(new Employee(400, "Steve", 150));
		employees.add(new Employee(190, "David", 400));
	}

	/* This method finds the CEO from the list of employees */
	public Employee findCEO() {
		for (int i = 0; i < employees.size(); i++) {
			if (0 == employees.get(i).getManagerId()) {
				Employee ceo = employees.get(i);
				ceo.setLevel(0);
				return ceo;
			}
		}
		return null;

	}

	/* This method finds the subordinates for a particular employee */
	public ArrayList<Employee> showSubordinates(Employee emp) {
		ArrayList<Employee> subordinates = new ArrayList<Employee>();
		for (int i = 0; i < employees.size(); i++) {
			if (emp.getEmployeeId() == employees.get(i).getManagerId()) {
				subordinates.add(employees.get(i));
			}
		}
		return subordinates.size() != 0 ? subordinates : null;
	}

	/* This recursive method gets the list of employees in hierarchical order */
	public ArrayList<Employee> buildTree(Employee ceo, ArrayList<Employee> result) {

		result.add(ceo);
		ArrayList<Employee> subordinates = showSubordinates(ceo);
		if (subordinates != null) {
			for (int i = 0; i < subordinates.size(); i++) {
				subordinates.get(i).setLevel(ceo.getLevel() + 1);
				buildTree(subordinates.get(i), result);
			}
		}
		return result;
	}

}