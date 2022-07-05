package com.java.learning;

public class Function {
	public int add(int a, int b) {
		int sum = a + b;
		return sum;
	}

	public static void main(String[] args) {
		Function f = new Function();
	int add	 = f.add(20,30 );
		System.out.println(add);
		System.out.println(f.add(23,34 ));
		

	}

}
