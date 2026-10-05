package com.javaIntroduction;

public class Typecast {
	// int to double
	double i1 = 5000;
	// double to int
	int i2 = (int) 9000.000000;
	// int to char
	char c1 = 98;
	// char to int
	int c2 = (int) 'c';

	public static void main(String[] args) {
		Typecast t1 = new Typecast();
		System.out.println(t1.i1);
		System.out.println(t1.i2);
		System.out.println(t1.c1);
		System.out.println(t1.c2);
		

	}

}
