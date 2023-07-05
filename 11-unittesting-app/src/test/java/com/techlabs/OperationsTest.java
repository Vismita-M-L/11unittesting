package com.techlabs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.techlabs.Operations;

class OperationsTest {

	@Test
	void testAddition() {
		Operations operations=new Operations();
		int expected=10;
		int actual=operations.addition(5, 5);
		assertEquals(expected,actual);
		}
	@Test
	void testSubstraction() {
		Operations operations=new Operations();
		int expected=5;
		int actual=operations.substraction(10, 5);
		assertEquals(expected,actual);
		}
	@Test
	void testMultiplication() {
		Operations operations=new Operations();
		int expected=25;
		int actual=operations.multiplication(5, 5);
		assertEquals(expected,actual);
		}
	@Test
	void testDivision() {
		Operations operations=new Operations();
		int expected=1;
		int actual=operations.division(5, 5);
		assertEquals(expected,actual);
		}
	@Test
	void testEvenOrNot() {
		Operations operations=new Operations();
		assertTrue(operations.isEven(2));
		
	}

}
