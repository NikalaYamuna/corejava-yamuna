package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Maxormin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an Array size:");
		int size = sc.nextInt();
		int[] num = new int[size];
		
		System.out.println("Enter the " + size + " numbers:");
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		int max = num[0];
		int min = num[0];
		for (int i = 0; i < num.length; i++) {
		
			if (num[i] > max) {
				max = num[i];
			} else if (num[i] < min) {
				min = num[i];
			}
		}
		System.out.println("Given numbers are :" + Arrays.toString(num));
		System.out.println("Maximum number is " + max);
		System.out.println("Minimum number is " + min);
		sc.close();
	}

}
