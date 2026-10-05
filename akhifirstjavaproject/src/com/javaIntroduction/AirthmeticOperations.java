package com.javaIntroduction;

public class AirthmeticOperations {

	double add() {
		int a = 11;
		double b = 8.56;
		return a + b;
	
	}

	int sub() {
		int a1 = 64;
		long b1 = 677777787654L;

	return  (int) b1 - a1;
		
	}

	int multiple() {
		
		int a2 = 7;
		int b2 = 14;

		return a2 * b2;
	
	}

	int div() {
		int a3 = 49;
		int a4 = 7;
		
		return a3 / a4;
	}

	public static void main(String[] args) {
		AirthmeticOperations t = new AirthmeticOperations();
System.out.println("Addition:  "+t.add());
System.out.println("Substraction: "+t.sub());
System.out.println("Multiplication:"+t.multiple());
System.out.println("Division:"+t.div());


}
	
}
