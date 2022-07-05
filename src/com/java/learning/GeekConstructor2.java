package com.java.learning;
class Geek2{
	String name;
	int roll;
	
	Geek2(){
		System.out.println("object created....");
	}
	
	Geek2(String na, int ro){
		name = na;
		roll = ro;
	}
}

public class GeekConstructor2 {

	public static void main(String[] args) {
		Geek2 l = new Geek2();
		Geek2 g = new Geek2("AAAA",10);
		System.out.println("Geek name : "+ g.name + " Roll: "+g.roll );
		
		

	}

}
