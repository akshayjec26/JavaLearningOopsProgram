package com.java.learning;
class Telecom{
	void network() {
		System.out.println("i make rule and regulation");
	}
}
class Airtel extends Telecom{
	void bank(){
		System.out.println("i am powerfful network");
	}
}
class Jio extends Telecom{
	void jioMart() {
		System.out.println("i have more customer");
	}
}

public class HeriricalInheritance {

	public static void main(String[] args) {
		Airtel a = new Airtel();
		a.network();
		a.bank();
		
		System.out.println(" ");
		
		Jio j = new Jio ();
		j.jioMart();
		j.network();
		
		System.out.println(" ");
		
		
		
		
	

	}

}
