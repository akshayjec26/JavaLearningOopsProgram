package com.java.learning;

public class Calculator3 {
	public static int add(int a, int b) {
		int sum = a + b;
		return sum;
	}
	public static int sub(int a , int b) {
		int sub = a - b;
		return sub;
	}
	public static int mul(int a, int b) {
		int multi = a * b;
		return multi;
	}
	public static double div(double a, double b) {
		double divi = a/b;
		return divi;
	}

	public static void main(String[] args) {
		
		System.out.println(add(20,30));
		System.out.println(sub(40, 23));
		System.out.println(mul(10,5 ));
		System.out.println(div(45, 7));
		            
	

	}

}
