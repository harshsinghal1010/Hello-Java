package com.hello.spring;

public class Employee {

	public Employee() {
		// TODO Auto-generated constructor stub
		System.out.println("CONSTRUCTOR called");
		
	}
	
	public static String getStaticName () {
		return "getStaticName";
	}
	
	public String getName() {
		return "getName";
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getName()+" "+getStaticName();
	}

}
