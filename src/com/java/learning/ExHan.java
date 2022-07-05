package com.java.learning;

public class ExHan {

	public static void main(String[] args) {
	try{
		int a = 10/2;
		System.out.println("i m divided by this number");
		int arr[] = {10,20,30,40 };
		System.out.println(arr[10]);
	}
	catch(ArithmeticException e) {
		System.out.println("this is not divided by 0");
		System.out.println(e);
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println(e);
	}
	System.out.println("rest of my code");

	}

}
