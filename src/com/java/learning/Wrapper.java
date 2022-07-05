package com.java.learning;

//https://www.geeksforgeeks.org/wrapper-classes-java/
public class Wrapper {

	public static void main(String[] args) {
		int a = 10;
		String b ="Ram";
		System.out.println(b.getClass().getSimpleName());
		System.out.println(((Object)a).getClass().getSimpleName());
		
		String num = "12";
		int ii = Integer.parseInt(num);
		
		//autoboxing
		
		int no = 234;
		Integer intobj = new Integer(no);
		System.out.println(intobj.getClass().getSimpleName());
		
		char ch ='a';
		Character chobj = new Character(ch);
		System.out.println(chobj.getClass().getSimpleName());
		
		float fo = 234f;
		Float foobj = new Float(fo);
		System.out.println(foobj.getClass().getSimpleName());
		
		double go = 23456.89;
		Double goobj = new Double(go);
		System.out.println(goobj.getClass().getSimpleName());
		
		//unboxing
		
		Integer in = 3456;
		int in1 = in;
		//System.out.println(in1.getClass());
		
		Character ch1 ='s';
		char chi = ch1;
		
		float un_fo = foobj;
		//System.out.println(un_fo.getClass());
		
		
		
		

	}

}
