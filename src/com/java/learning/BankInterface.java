package com.java.learning;


interface Bank {
	public void interst();
		
}

class Sbi implements Bank{
	public void interst() {
		System.out.println("sbi interest rate 8%");
	}
}

class pnb implements Bank{
	public void interst() {
		System.out.println("pnb interset rate 7%");
	}
}

public class BankInterface {

	public static void main(String[] args) {
		
             Bank b ;
             b = new Sbi();
             b.interst();
             
             b = new pnb();
             b.interst();
	}

}
