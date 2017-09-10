package com.company.core;

import java.util.ArrayList;

public class CompanyApp {

	public static void main(String[] args) {

		Staff staff = new Staff();
		Employee ceo = staff.findCEO();
		if (ceo != null) {

			ArrayList<Employee> result = new ArrayList<Employee>();
			result = staff.buildTree(ceo, result);

			for (int i = 0; i < result.size(); i++) {
				Employee employee = result.get(i);

				if (employee.getLevel() == 0) {
					System.out.println(employee.getEmployeeName());
				}

				if (employee.getLevel() == 1) {
					System.out.println("      " + employee.getEmployeeName());
				}

				if (employee.getLevel() == 2) {
					System.out.println("             " + employee.getEmployeeName());
				}

			}
		} else {
			System.out.println("CEO is not present. Please check the staff data");
		}
	}

}