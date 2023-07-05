package com.techlabs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmployeeTest {

	@Test
	void testCalculateMonthlySalary() {
		Employee salary=new Employee(1, "Vismita", 20000, 4000, 3000, 2000);
		double actualsalary=29000;
		double expectedsalary=salary.CalculateMonthlySalary();
		assertEquals(expectedsalary, actualsalary,"Montly Salary Matched");
		
		
	}
	@Test
	void testCalculateYearlySalary() {
		Employee salary=new Employee(1, "Vismita", 20000, 4000, 3000, 2000);
		double actualsalary=348000;
		double expectedsalary=salary.CalculateYearlySalary();
		assertEquals(expectedsalary, actualsalary,"Yearly Salary Matched");
	}
	

}
