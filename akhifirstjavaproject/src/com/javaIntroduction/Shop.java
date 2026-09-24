package com.javaIntroduction;

public class Shop {

	static int chococost = 15;
	static int cookiecost = 10;
	int totalamount = 450;
	int totalcost = chococost * 10 + cookiecost * 5;

	public static void main(String[] args) {
		Shop t1 = new Shop();

		System.out.println("Chococost is " + chococost * 10);
		System.out.println("Cookiecost is " + cookiecost * 5);
		System.out.println("Totalcost is " + t1.totalcost);

		System.out.println("RemainingBal is " + (t1.totalamount - t1.totalcost));

	}

}
