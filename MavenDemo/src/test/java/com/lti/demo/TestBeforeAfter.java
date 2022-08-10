package com.lti.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class TestBeforeAfter {
	
	Calculator c=new Calculator();
	int sum=0;
	
	@BeforeEach@Disabled
	public void testStartup() {
		sum=0;
		System.out.println("sum is zero"+sum);
	}
	@Test
	public void testsAddTwoNos() {
		
		System.out.println("Test case 1..");
		Assertions.assertEquals(300, c.addNos(100,200));
	}
	@Test
	public void testsSubTwoNos() {
		
		System.out.println("test case 2");
		Assertions.assertEquals(300, c.subNos(500,200),"Pls check before you run");
		
	}
	
	@AfterEach@Disabled
	void testShutDown() {
		System.out.println(" some object null");
	}
	@AfterAll
	public void end() {
		System.out.println("Shutting db Connection");
	}

}
