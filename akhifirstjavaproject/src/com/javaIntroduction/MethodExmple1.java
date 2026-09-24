package com.javaIntroduction;

public class MethodExmple1 {
 static void method1() {
	 System.out.println("1st static method");
 }
 static void method2() {
	 System.out.println("2nd static method");
	
 }
 static void method3() {
	 
	 System.out.println("3rd static method");

	 
 }
 void instancemethod1() {
	 System.out.println("1st Instance method");
 }
 void instancemethod2() {
	 System.out.println("2nd Instance method");
 }
 static {
	 method1();
	 method2();
	 method3();
 }
 {
	 instancemethod1();
	 instancemethod2();
 }
 
 
  public static void main(String[] args) {
	  System.out.println("static called");
	  MethodExmple1 m1=new MethodExmple1();
	  System.out.println("Instance called");
  }
	
}
