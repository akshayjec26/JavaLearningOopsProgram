package com.java.learning;

import java.util.HashMap;
import java.util.Map;

public class CountOccuring {
	
	public static void totalNu(String name) {
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		char sArray[] = name.toCharArray();
		for(char c:sArray) {
			if(hm.containsKey(c)) {
				hm.put(c,hm.get(c)+1 );
			}
			else {
				hm.put(c, 1);
			}
		}
		for(Map.Entry me:hm.entrySet()) {
			System.out.println(me.getKey()+ " " +me.getValue());
		}
		
		
		System.out.println(name + " : "+hm);
	}

	public static void main(String[] args) {
		totalNu("akshay");


	}

}
