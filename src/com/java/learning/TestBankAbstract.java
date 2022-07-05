package com.java.learning;

abstract class Bank3{
	abstract void interest();
	Bank3(){
		System.out.println("i am default constructor");
	}
}

class Sbi3 extends Bank3{
	  void interest(){
		  System.out.println(" sbi interest rate 8 %");
		 
	 }
}

class Pnb3 extends Bank3{
	  void interest() {
		  System.out.println("pnb interset rate 7%");
	  }
}



public class TestBankAbstract {

	public static void main(String[] args) {
		Bank3 b;
		b = new Sbi3();
		b.interest();
		
		b = new Pnb3();
		b.interest();
		

	}

}
