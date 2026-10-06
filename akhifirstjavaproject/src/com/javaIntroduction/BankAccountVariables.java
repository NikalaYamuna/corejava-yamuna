package com.javaIntroduction;

public class BankAccountVariables {
	static int bankbal = 1000;

	int Deposit() {
		int depositamount = 2000;
		bankbal = bankbal + depositamount;

		return bankbal;
	}

	int Withdraw() {
		int withdrawamount = 1000;
		bankbal=bankbal-withdrawamount;
		return bankbal ;
	}

	

	public static void main(String[] args) {
		BankAccountVariables b1 = new BankAccountVariables();
		System.out.println("Deposited amount:"+b1.Deposit());
		
		System.out.println("Withdraw amount:"+b1.Withdraw());
		System.out.println("Total Bal:"+bankbal);
		
	}

}
