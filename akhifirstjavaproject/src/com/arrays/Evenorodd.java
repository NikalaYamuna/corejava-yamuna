package com.arrays;


import java.util.Arrays;
import java.util.Scanner;

public class Evenorodd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a size:");
		int size = sc.nextInt();
		int[] numbers = new int[size];
		int evencount=0;
		int oddcount=0;
		System.out.println("Enter the " +size +" numbers:");
		for(int i=0;i<numbers.length;i++) {
			numbers[i]=sc.nextInt();
			if(numbers[i]%2==0) {
        		evencount++;}
			else {
				oddcount++;
			}
		}
		
		int[] evenarr = new int[evencount];
		int[] oddarr = new int[oddcount];
		int evenindex = 0;
		int oddindex = 0;
        for(int i=0;i<numbers.length;i++) {
        	if(numbers[i]%2==0) {
				evenarr[evenindex] = numbers[i];
				evenindex++;
        		
        	}
        	else  {
        		oddarr[oddindex] = numbers[i];
				oddindex++;
        	}
        
        }
        System.out.println("Given numbers are :" + Arrays.toString(numbers));
		System.out.println("Even numbers : " + Arrays.toString(evenarr));
		System.out.println("Odd numbers : " + Arrays.toString(oddarr));
        System.out.println("Even count is:"+evencount);
    	System.out.println("Odd count is:"+oddcount);
    	sc.close();
	}

}
