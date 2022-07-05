package com.java.learning;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList<Integer> arrli = new ArrayList<Integer>();
		arrli.add(10);
		arrli.add(20);
		arrli.add(25);

		System.out.println(arrli);
		arrli.remove(2);
		System.out.println(arrli.get(1));
		
		for(int i = 0; i<5; i++) {
			arrli.add(i+5);
			
			
		}
		System.out.println(arrli);

	}

}
