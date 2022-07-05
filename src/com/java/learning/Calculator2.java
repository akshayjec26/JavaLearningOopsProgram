package com.java.learning;

public class Calculator2 {
	public int add(int a, int b) {
		return a + b;
	}
	public int sub(int a , int b) {
		return a - b;
	}
	public int mul(int a, int b) {
		return a * b;
	}
	public double div(double a, double b) {
		return a/b;
	}

	public static void main(String[] args) {
		Calculator2  cal = new Calculator2();
		System.out.println(cal.add(20,30));
		System.out.println(cal.sub(40, 23));
		System.out.println(cal.mul(10,5 ));
		System.out.println(cal.div(45, 7));
		            
	

	}

}
