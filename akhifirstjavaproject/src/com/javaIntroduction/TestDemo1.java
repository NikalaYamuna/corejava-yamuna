package com.javaIntroduction;

public class TestDemo1 {
	void hello() {
		System.out.println("Hello guys, Good morning, Have a nice day !");
		System.out.println("Hello guys, Good morning, Have a nice day !");
	}
	public static void main(String[] args) {
		System.out.println("main method started ");
		
		TestDemo1 t = new TestDemo1();
		
		//Calling the methods.
		welcome();
		t.hello();
		
		System.out.println("main method ended ");
	}
	public static void welcome() {
		System.out.println("Welcome to Vcube !! ");
		System.out.println("Welcome to Vcube !! ");
		System.out.println("Welcome to Vcube !! ");
	}
}
