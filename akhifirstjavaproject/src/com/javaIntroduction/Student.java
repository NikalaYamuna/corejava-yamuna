package com.javaIntroduction;

public class Student {
	
	int rollno;
	String name;
	float marks;
	static String collegecode="J2";
	static String collegeAddress="Moinabad";
	
  static {
	  System.out.println("JBREC");
  }
  {
	  System.out.println("Student object created");
  }
	void student1(){
		System.out.println("Student Details-1");
		System.out.println("Rollno :"+rollno);
		System.out.println("Name :"+name);
		System.out.println("Marks :"+marks);
	}
	void student2(){
		System.out.println("Student Details-2");
		System.out.println("Rollno :"+rollno);
		System.out.println("Name :"+name);
		System.out.println("Marks :"+marks);
	}
	static  void college(){
		System.out.println("Collegecode : "+collegecode);
		System.out.println("CollegeAddress : "+collegeAddress);
		
	}
	
	public static void main(String[] args) {
		Student st1= new Student();
		Student st2= new Student();
		st1.rollno=2021112798;
		st1.name="Madhavi";
		st1.marks=98;
		st2.rollno=2021112797;
		st2.name="Yamuna";
		st2.marks=97;
	
		st1.student1();
		st2.student2();
		
	}
}
