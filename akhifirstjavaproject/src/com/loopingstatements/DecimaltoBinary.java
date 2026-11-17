package com.loopingstatements;

import java.util.Scanner;

public class DecimaltoBinary {

	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in) ;
	  System.out.println("Enter a no:");
	  int n=sc.nextInt();
	  int rem=0;
	  String bin="";
	  while(n>0) {
		  rem=n%2;
		  n=n/2;
	 bin=rem+bin;
	 
	 	 

	  }
	  System.out.println("binary no:"+bin);
	  sc.close();
	}

}
