package com.company.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;
import com.company.core.Employee;
import com.company.core.Staff;

public class StaffTest {

	Staff staff;

	@Before
	public void setUp() throws Exception {
		staff = new Staff();
	}

	@Test
	public void testCEOMethod() {
		Employee ceo = staff.findCEO();
		if (ceo != null)
			assertTrue(ceo.getEmployeeName().equalsIgnoreCase("Jamie"));
	}

	@Test
	public void testSubordinatesMethod() {
		Employee ceo = staff.findCEO();
		if (ceo != null) {
			ArrayList<Employee> subordinatesList = staff.showSubordinates(ceo);
			assertTrue(subordinatesList.size() == 2);
		}
	}

	@Test
	public void testBuildTree() {
		Employee ceo = staff.findCEO();
		if (ceo != null) {
			ArrayList<Employee> result = new ArrayList<Employee>();
			result = staff.buildTree(ceo, result);
			assertTrue(result.size() == 6);
		}
	}

	@Test
	public void testCEOMethodNegative() {
		Employee ceo = staff.findCEO();
		if (ceo == null)
			assertNull(ceo);

	}

}
