package com.java.learning;

public class StringBBulider {

	public static void main(String[] args) {
		StringBuilder s1 = new StringBuilder("java");
		System.out.println(s1);
		s1.append("testing");
		System.out.println(s1);
		s1.append("Development");
		System.out.println(s1);
		s1.reverse();
		System.out.println(s1);
		System.out.println("   ");
		
		
		
		
		StringBuffer sb1 = new StringBuffer("B");
		StringBuffer sb2 =  new StringBuffer("B");
		System.out.println(sb1.hashCode());
		System.out.println(sb2.hashCode());
		System.out.println(sb1.equals(sb2));
		
	}

}
