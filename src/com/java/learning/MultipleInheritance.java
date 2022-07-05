package com.java.learning;


interface Sbi6{
    void interset(); 
		
	
}

interface Pnb6{
	 void commission();
}



public class MultipleInheritance implements Sbi6,Pnb6 {
	
	public void interset() {
		System.out.println("i m sbi bank");
	}
	public void commission() {
		System.out.println("i m pnb bank");
	}

	public static void main(String[] args) {
		MultipleInheritance mi = new MultipleInheritance();
		mi.commission();
		mi.interset();
		

	}

}
