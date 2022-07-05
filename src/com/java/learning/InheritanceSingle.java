package com.java.learning;

class Demo1{
	void show() {
		System.out.println("i am super class");
	}
}


class Demo2 extends Demo1{
	void see() {
		System.out.println("i am sub class");
	}
}



public class InheritanceSingle {


	public static void main(String[] args) {
		Demo2 d = new Demo2();
		d.see();
		d.show();
		d.see();
		
	}

}
