package com.javaIntroduction.constructor;

public class Student {
	static int count=0;

	Student(){
		count++;
		System.out.println("No-arg Constructor is called!!");
	}
	
	
	public static void main(String[] args) {
		new Student();
		new Student();
		new Student();
		System.out.println("Object Count:"+count);
		
	}
	
}
