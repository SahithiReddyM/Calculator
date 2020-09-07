package com.sapient.service;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Before Class Mtd");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("After Class Mtd");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Before test Mtd");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("After test Mtd");
	}

	@Test
	public void isValidTestAddition() {
		Calculator calculator=new Calculator();
		assertEquals("Addition passed",5.0,calculator.addition(2.0, 3.0),0.01);//tollerance value required for double
	}
	@Test
	public void isInvalidTestAddition() {
		Calculator calculator=new Calculator();
		assertNotEquals("Addition failed",4.0,calculator.addition(2.0, 3.0),0.01);//tollerance value required for double
	}
   
	@Test
	public void isValidTestSubstraction() {
		assertEquals("Substraction passed",1,new Calculator().substraction(2, 1));
	}
	@Test
	public void isInvalidTestSubstraction() {
		assertNotEquals("Substraction failed",0,new Calculator().substraction(2, 1));
	}
}
