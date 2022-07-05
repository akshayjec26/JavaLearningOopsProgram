package com.java.learning;
 
 abstract class Shape{
	 abstract void draw();
	 void concreatFun() {
		 System.out.println("print shape");
	 }
	 
 }
 class Rectangle extends Shape{
	  void draw() {
		  System.out.println("print Rectangle");
	  }
 }
 class Circle extends Shape{
	 void draw() {
		 System.out.println("print circle");
	 }
 }

public class ShapeAbstract {

	public static void main(String[] args) {
		Shape s;
		s = new Rectangle();
		s.draw();
		s.concreatFun();
		
		s = new Circle();
		s.draw();
		s.concreatFun();
		

	}

}
