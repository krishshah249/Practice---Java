package cg;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	
	static Calculator ob;

	@BeforeAll
	public static void beforeAllTests() {
		
		System.out.println("Before All Tests");
		ob= new Calculator();
	}
	
	@AfterAll
	public static void afterAlltest() {
		
		System.out.println("After All Tests");
		ob=null;
	}
	
	
	@BeforeEach
	public void beforeEachTest() {
		System.out.println("Before Each test");
		ob=new Calculator();
	}
	
	@AfterEach
	public void afterEachTest() {
		System.out.println("After Each test");
		ob=null;
	}
	
	@Test
	public void testadd() {
		
		System.out.println("Test Case testadd");
		//Assert.assertEquals(9,ob.add(4,5));
		assertEquals(9,ob.add(4,5));
	}
	
	@RepeatedTest(5)
	//@Test
	public void testadd1() {

		System.out.println("Test Case testadd1");
		//Assert.assertEquals(9,ob.add(4,5));
		assertTrue(ob.add(4,5)>0);
		assertTrue(ob.add(4,-5)>=0);
	}
	
	@Test
	public void testadd2() {
		
		System.out.println("Test Case TestIdGenerator");
		assertTrue(ob.getId()>=0&&ob.getId()<1000);
		
	}
	
	
}
