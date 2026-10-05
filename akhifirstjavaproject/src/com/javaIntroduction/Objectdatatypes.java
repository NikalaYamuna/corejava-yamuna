package com.javaIntroduction;

public class Objectdatatypes {
	// Converting primitive data types to wrapper data types is called Auto-boxing
	Integer studid = 101;
	Double marks = 8.589;
	Boolean status = true;
	// Converting wrapper data types to primitive data types is called Auto-Unboxing
	// Converting wrapper to primitive (Explicit unboxing)
	int id = studid.intValue();
	double score = marks.doubleValue();
	boolean flag = status.booleanValue();

	public static void main(String[] args) {
		Objectdatatypes s1 = new Objectdatatypes();
		System.out.println("Student Details:");
		System.out.println(s1.studid);
		System.out.println(s1.marks);
		System.out.println(s1.status);
		System.out.println(s1.id);
		System.out.println(s1.score);
		System.out.println(s1.flag);
	}

}
