package com.loopingstatements;

import java.util.Scanner;

public class Magicno {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no:");
		int n=sc.nextInt();
		int temp=n;
		while (temp > 9) {
            int sum = 0;
            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;     
            }
            temp = sum; 
        }
		if(temp==1) {
			System.out.println(n+ " is a Magic number");
		}
		else {
			System.out.println(n+ " is not a Magic number");
		}
    }

	}


