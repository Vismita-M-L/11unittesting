package com.techlabs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import static org.mockito.Mockito.*;

class Employee1Test {
	Employee1 employee;
	@Mock
	Department department;
	@BeforeEach
	void init() {
		Department department=mock(Department.class);
;		employee=new Employee1(1,"vismita",department);
	}

	@Test
	void testGetDepartment() {
		
	}
	@Test
	void testSetDeaprtment() {

}
}
