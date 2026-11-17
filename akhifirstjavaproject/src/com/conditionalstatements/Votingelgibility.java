package com.conditionalstatements;

import java.util.Scanner;

public class Votingelgibility {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a age:");
		int age=sc.nextInt();
		if(age<=0) {
			System.out.println("Invalid age");	
		}
		else if(age<18) {
			System.out.println("Your age is "+age+" i.e  below 18 , So you are not eligible to vote");
		}
		else {
			System.out.println("Are you Indian citizenship..?");
			boolean citizenship=sc.nextBoolean();
			if(!citizenship) {
				System.out.println("Your are not having Indian Citizenship , So you are not eligible to vote");
			}
			else  {
				System.out.println("Are you having VoterId..?");
				boolean vid =sc.nextBoolean();
				 if (!vid) {
	                    System.out.println("Voter ID is Required!Please Apply Voter Id to cast your Vote.");
	                } else {
	                    System.out.println("You are successfully Eligible to vote");
	                }
				
		}
		}}
	}


