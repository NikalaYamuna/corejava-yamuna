package com.loopingstatements;

import java.util.Random;
import java.util.Scanner;

public class Randomno {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Random r =new Random();
		 char playAgain;

	do {	int genno=r.nextInt(100)+1;
		boolean hasGuessedCorrectly = false;
		
		System.out.println("You are having only 3 chances-TRY TO GUESS CORRECT NUMBER!");
	    for(int i=0;i<3;i++) {
	    	System.out.println("Enter a number between 1-100:");
	    	int guessno=sc.nextInt();
	    	if(guessno<genno) {
	    		System.out.println("Too Low!Try Again");
	    	}
	    	else if(guessno>genno) {
	    		System.out.println("Too High!Try Again");
	    	}
	    
	    	else {
	    		System.out.println("Congratualtions!!You guessed the correct number");
	    		hasGuessedCorrectly = true;
	    		break;
	    		
	    	}
	    	
	    }
	    if (!hasGuessedCorrectly) {
	    System.out.println("Game over!!You are unable to guess the correct number");
	    System.out.println("The correct number is:"+genno);
	    }
	    System.out.print("\nDo you want to continue? (y/n): ");
        playAgain = sc.next().charAt(0);
	}while (playAgain == 'y' || playAgain == 'Y');
	    sc.close();
	    }
		

}
