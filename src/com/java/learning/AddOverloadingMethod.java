package com.java.learning;
//addOverloadingProgram
public class AddOverloadingMethod {
	public int add(int a, int b) {
		int sum = a + b;
		return sum;
	}
	
	
	public int add(int a, int b, int c) {
		return a  + b + c;
	}
	
	public double add(double a, double b) {
		return a + b;
	}
	

	public static void main(String[] args) {
		AddOverloadingMethod f = new AddOverloadingMethod();
		System.out.println(f.add(50, 70, 88));
		System.out.println(f.add(30, 40));
		System.out.println(f.add(10.56, 45.5));
	
	}

}
