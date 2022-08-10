package com.lti.demo;

public class Calculator {
	public int  addNos(int a,int b) {
		return (a+b);
	}
	public String sayHello() {
		System.out.println("Hello World");
		return "Hello World";
	}
	public int  subNos(int a,int b) {
		return (a-b);
	}
	public void searchEmp(int empId) {
		if(empId==0) {
			throw new ArithmeticException("u entered zero");
		}
		else {
			System.out.println(" do something");
		}
	}
}
