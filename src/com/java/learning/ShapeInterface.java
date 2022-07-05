package com.java.learning;


interface Shape1{
	public void draw();
		
}
   

class Rectangle1 implements Shape1{
	public void draw(){
		System.out.println("print rectangle");
		
	}
}

class Circle1 implements Shape1{
	public void draw() {
		System.out.println("print circle");
	}
}
public class ShapeInterface {

	public static void main(String[] args) {
		Shape1 s;
		s = new Rectangle1();
		s.draw();
	    s = new Circle1();
	    s.draw();

	}

}
