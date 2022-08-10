package com.lti.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class CalculatorTests {
	Calculator c=new Calculator();
	@Test@Disabled
	public void tetsCalcSayHello() {
		
		//System.out.println("testing...");
		Assertions.assertEquals("Hello World", c.sayHello());
	}
	@Test@Disabled
	public void testsAddTwoNos() {
	
		//System.out.println("testing...");
		Assertions.assertEquals(300, c.addNos(100,200));
	}
	
	@Test@Disabled
	public void testsSubTwoNos() {
	
		//System.out.println("testing...");
		Assertions.assertEquals(3000, c.subNos(500,200),"Pls check before you run");
		
	}
	
	@Test @Disabled
	public void testsAssertNull() {
	
		String s1=null;
		String s2="Anshu";
		Assertions.assertNull(s1);
		//Assertions.assertNull(s2);
		
	}
	@Test
	public void testsAssertFalse() {
	
		Assertions.assertFalse("Anshu".length()==6);
		//Assertions.assertFalse(10>20);
		Assertions.assertNotEquals("Hello", "hello");
		
	}
}
