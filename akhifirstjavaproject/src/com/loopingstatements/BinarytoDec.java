package com.loopingstatements;

import java.util.Scanner;

public class BinarytoDec {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in) ;
		  System.out.println("Enter a Binaryno:");
		  int n=sc.nextInt();
		  int rem=0;
		  int sum=0;
		  int i=0;
		  while(n>0) {
			  rem=n%10;
			  n=n/10;
		sum=sum+(int)Math.pow(2,i)*rem;
		 i++;
		 	 

		  }
		  System.out.println("Decimal no:"+sum);
		  sc.close();

	}

}
