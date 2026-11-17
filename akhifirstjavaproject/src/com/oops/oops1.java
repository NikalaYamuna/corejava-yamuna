package com.oops;

public class oops1 {

	public static void main(String[] args) {
		
		Encapsulation e1=new Encapsulation();
		e1.setId(101);
		e1.setName("Yamu");
		e1.setSalary(500000);
		e1.setPw("Yamu@01234");
		System.out.println("Details:");
		System.out.println("Id:"+e1.getId());
		System.out.println("Name:"+e1.getName());
		System.out.println("Salary:"+e1.getSalary());
		System.out.println("Password:"+e1.getPw());

	}

}
