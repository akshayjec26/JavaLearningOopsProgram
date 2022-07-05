package com.java.learning;

public class ReverseNumFunction {
	public int rev(int num) {
		int temp = num;
		int rev =0,rem ;
		while(temp !=0) {
			rem = temp%10;
			rev = rev * 10 +rem;
			temp = temp/10;
			
		}
		return rev;
	}
	

	public static void main(String[] args) {

		ReverseNumFunction rf =  new ReverseNumFunction();
		System.out.println(rf.rev(876543));
		
	}
}
