package com.lti.demo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class ParametersTest {

	@ParameterizedTest@Disabled
	@ValueSource(ints= {8,10,30,14,20})
	public void testIntAryParam(int ar) {
		System.out.println("arg:"+ar);
		Assertions.assertTrue(ar%2==0);
	}
	
	@ParameterizedTest@Disabled
	@ValueSource(strings= {"Hello","world"})
	public void testParams(String msg) {
		
		Assertions.assertNotNull(msg);
	}
	
	@Test@Disabled
	public void testLambdaList() {
		Integer[] intAry= {10,20,5,25};
		List<Integer> intList=Arrays.asList(intAry);
		
		Assertions.assertAll(
				()->assertEquals(10,intList.get(0)),
				()->assertEquals(20,intList.get(1))
//				()->assertEquals(20,intList.get(2)),
//				()->assertEquals(20,intList.get(3))
				);
		
	}
	
	@RepeatedTest(value=3,name="Repeat 3 Times")
	public void repeatTest() {
		int a=10,b=20;
		Assertions.assertEquals(200, a*b);
	}
}
