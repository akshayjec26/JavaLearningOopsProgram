package com.java.learning;

public class OddEvenFunction {
	
	public  int num(int a) {
		if (a % 2 ==0) {
			System.out.println(a +" is even");
			
		}
		else {
			System.out.println(a+" is odd");
		}
		return a ;
	}
		
	public static void main(String[] args) {
		OddEvenFunction ev = new OddEvenFunction();
				System.out.println(ev.num(40));
	

	}

}
