package com.java.learning;

public class StudentToString {
	String name;
	int roll;
	String city;
	
	StudentToString(String name, int roll, String city){
		this.name = name;
		this.roll = roll;
		this.city = city;
	}
	
	public String toString(){
		return "Name: "+ name + " Roll: "+ roll +" city : "+ city;
		
	}

	public static void main(String[] args) {
		StudentToString st = new StudentToString("raju", 20, "Bangluru");
		System.out.println(st);
				
		

	}

}
