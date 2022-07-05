package com.java.learning;
class Geek{
	String name;
	int roll;
	
	Geek(){
		System.out.println("object created....");
	}
	
	Geek(String name){
		this.name = name; 
	}
	
	
	Geek(String name, int roll){
		this.name = name;
		this.roll = roll;
	}
}

public class GeekConstructor {

	public static void main(String[] args) {
		Geek l = new Geek();
		Geek g = new Geek("AAAA",10);
		System.out.println("Geek name : "+ g.name + " Roll: "+g.roll );
		Geek p = new Geek("raju");
		System.out.println("Geek name with one arg :"+ p.name);
		
		

	}

}
