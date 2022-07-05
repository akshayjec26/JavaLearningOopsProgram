package com.java.learning;

import java.util.HashMap;

public class ExHashMap {

	public static void main(String[] args) {
		HashMap <String,Integer> hm = new HashMap<>();
		hm.put("jonh",56789);
		hm.put("vinod", 34756);
		hm.put("ram", 98764);
		System.out.println(hm);
		
		hm.put("john", 56349);
		System.out.println(hm);
		
		System.out.println(hm.get("john"));
		System.out.println(hm.remove("john"));
		System.out.println(hm);
		System.out.println(hm.containsKey("jonh"));
		System.out.println(hm.containsValue(56789));
		

	}

}
