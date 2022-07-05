package com.java.learning;

public class Recharging {
	public float recharge(float amt) {
		System.out.println("recharge sucessfull");
		return (amt - 11.5f);
	}
	

	public static void main(String[] args) {
		Recharging re = new Recharging();
		float rech = re.recharge(100f);
		
		// System.out.println(re.recharge(150f));
		System.out.println(rech);
		

	}

}
