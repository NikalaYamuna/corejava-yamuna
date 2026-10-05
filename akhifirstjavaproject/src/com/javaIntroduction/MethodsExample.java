package com.javaIntroduction;

public class MethodsExample {
	 int rollno;
	 String name;
	 String course;
	 int java;
	 int python;
	 int mysql;
	 int sum;
	 double avg;
	 
	 
	 
	 void displayStudentDetails() {
		System.out.println("Student Details:");
		System.out.println("Rollno:"+rollno);
		System.out.println("Name:"+name);
		System.out.println("Course:"+course);
	 }
	 void calculateTotal() {
		 System.out.println("Marks of Student:");
		 System.out.println("Java :"+java);
		 System.out.println("Python :"+python);
		 System.out.println("Mysql :"+mysql);
		 System.out.println("Total Marks:"+sum);
		 
		 
	 }
	 void calculateAverage() {
		 System.out.println("Average marks:"+avg);
	 }

	public static void main(String[] args) {
		MethodsExample m =new MethodsExample();
		m.rollno=3328;
		m.name="Sakshi";
		m.course="Java Full Stack";
		
		
		
		MethodsExample m1=new MethodsExample();
		m1.java=90;
		m1.python=88;
		m1.mysql=97;
		m1.sum=m1.java+m1.python+m1.mysql;
		MethodsExample m2=new MethodsExample();
		m2.avg=m1.sum/3;
		m.displayStudentDetails();
		m1.calculateTotal();
		m2.calculateAverage();
		
	

	}

}
