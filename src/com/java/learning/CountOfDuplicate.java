package com.java.learning;

import java.util.HashMap;
import java.util.Map;

public class CountOfDuplicate {
	
	public static void getDupliCount(String name) {
		HashMap<Character,Integer> hm = new HashMap<>();
		char[] nameArr = name.toCharArray();
		for(char c:nameArr) {
			if(hm.containsKey(c))
				hm.put(c,hm.get(c)+1);
			else 
				hm.put(c,1);
			
		}
		System.out.println(hm);
		for(Map.Entry me:hm.entrySet()) {
			//for duplicate > 1
			if((int)me.getValue() == 1) {
				int a1;
			//System.out.println(me.getKey()+" "+me.getValue());
			System.out.println(me.getKey());
		}
		}
	}
	
	

	public static void main(String[] args) {
		getDupliCount("abcdabcdeaabbbcccccccf");


	}

}
