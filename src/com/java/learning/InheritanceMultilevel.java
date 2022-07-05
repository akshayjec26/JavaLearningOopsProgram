package com.java.learning;

class Sample1{
	void show() {
		System.out.println("1st day show");
	}
}
class Sample2 extends Sample1{
	void man() {
		System.out.println("entry one man");
	}
}
class Sample3 extends Sample2{
	void sit() {
		System.out.println("sit on the chair");
	}
}

public class InheritanceMultilevel {

	public static void main(String[] args) {
		Sample3 s3 = new Sample3();
		s3.show();
		s3.man();
		s3.sit();
		
		
		

	}

}
