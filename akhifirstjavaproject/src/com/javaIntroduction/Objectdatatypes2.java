package com.javaIntroduction;

import java.math.BigDecimal;
import java.math.BigInteger;
 class Cat{
	 
 }
public class Objectdatatypes2 {
	// Predefined Classess
	String s1 = "Yammu";
	StringBuffer sb = new StringBuffer("101");
	BigInteger b1 = new BigInteger("10000000000000000");
	BigDecimal bd1 = new BigDecimal("80000.0000000089563300000000000000000");
	// Wrapper data types
	
	
	Integer age = 22;
	Double mrks = 9000.00;
	Character grade = 'A';
	Boolean passed = true;
	
	//Object data type
 Cat  c1;
	public static void main(String[] args) {
		Objectdatatypes2 ob1=new Objectdatatypes2();
		System.out.println(ob1.s1);
		System.out.println(ob1.sb);
		System.out.println(ob1.b1);
		System.out.println(ob1.bd1);
		System.out.println(ob1.age);
		System.out.println(ob1.mrks);
		System.out.println(ob1.grade);
		System.out.println(ob1.passed);

	}

}
