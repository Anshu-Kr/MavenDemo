package com.lti.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.sun.xml.internal.bind.v2.runtime.IllegalAnnotationException;

class ExceptionTest{

	@Test
	void testExceptions() {
		Assertions.assertThrows(IllegalArgumentException.class,
				()->{Integer.parseInt("one");}
				);
	}
	
	@Test
	public void testmethodExp() {
		Calculator c=new Calculator();
		final Exception e=assertThrows(ArithmeticException.class,()->{c.searchEmp(0);});
		Assertions.assertEquals("u entered zero", e.getMessage());
		System.out.println( e.getMessage());
	}
}
