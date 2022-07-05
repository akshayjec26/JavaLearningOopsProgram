package com.java.learning;

public class Encapsulation {
	private String name;
	private int age;
	 
	public String getName() {
		return name;
	}
	
	
	public int getAge() {
		return age;
	
	}
	
	public void  SetName(String name) {
		this.name =name;
		
	}
	
	
	public void setAge(int age) {
		this.age =age;
	}
	
	

	public static void main(String[] args) {
		Encapsulation en = new Encapsulation();
		en.setAge(20);
		en.SetName("raju");
		System.out.println(en.getName());
		System.out.println(en.getAge());
		
	

	}

}
