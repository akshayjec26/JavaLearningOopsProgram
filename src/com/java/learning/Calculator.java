package com.java.learning;

public class Calculator {
	public int add(int a, int b) {
		int sum = a + b;
		return sum;
	}
	public int sub(int a , int b) {
		int sub = a - b;
		return sub;
	}
	public int mul(int a, int b) {
		int multi = a * b;
		return multi;
	}
	public double div(double a, double b) {
		double divi = a/b;
		return divi;
	}

	public static void main(String[] args) {
		Calculator  cal = new Calculator();
		System.out.println(cal.add(20,30));
		System.out.println(cal.sub(40, 23));
		System.out.println(cal.mul(10,5 ));
		System.out.println(cal.div(45, 7));
		            
	

	}

}
