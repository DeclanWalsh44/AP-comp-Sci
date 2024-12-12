/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner input = new Scanner(System.in);
		int num = ((int)(Math.random() * 1000) + 1);
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.print("Guess a number between 1-1000: "); 
		int guess = input.nextInt();
		if(guess == num){
			System.out.println("You guessed correctly!");
		}
		else if (num > guess){
			System.out.println("Higher");
		}
		else{
			System.out.println("Lower");
		}
	}
}
