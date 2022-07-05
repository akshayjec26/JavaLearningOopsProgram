package com.java.learning;

public class ShowOverloadingMethod {
	public void show(int x) {
		System.out.println("in int " +x);
		
	}
	
	public void show(String  s) {
		System.out.println("in String " +s);
		
	}
	
	public void show(byte b) {
		System.out.println("in byte " +b);
		
	}

	
	public void show(double d) {
		System.out.println("in double " +d);
		
	}
	
	public static void main(String[] args) {
		
		ShowOverloadingMethod sh = new ShowOverloadingMethod();
		byte a  = 25;
		sh.show(a);
		sh.show("hello");
		sh.show('a');
		sh.show(7.5);

	}

}