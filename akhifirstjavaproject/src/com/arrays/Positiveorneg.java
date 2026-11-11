package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Positiveorneg {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an Array size:");
		int size = sc.nextInt();
		int[] num = new int[size];
		int positivecount = 0;
		int negcount = 0;
		System.out.println("Enter the " +size +" numbers:");
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
			if (num[i] < 0) {
				negcount++;
			} else {
				positivecount++;
			}
		}
		int[] posarr = new int[positivecount];
		int[] negarr = new int[negcount];
		int posindex = 0;
		int negindex = 0;
		for (int n : num) {
			if (n < 0) {

				negarr[negindex] = n;
				negindex++;

			} else {
				posarr[posindex] = n;
				posindex++;
			}
		}
		System.out.println("Given numbers are :" + Arrays.toString(num));
		System.out.println("Positive numbers : " + Arrays.toString(posarr));
		System.out.println("Negative numbers : " + Arrays.toString(negarr));
		System.out.println("Positive count is : " + positivecount);
		System.out.println("Negative count is : " + negcount);
		sc.close();
	}

}
