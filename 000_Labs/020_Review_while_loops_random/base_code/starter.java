/*
 *	Author:  Declan Walsh
 *  Date: 9/17/24
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int guess = -1;
		int num = (int)(Math.random()*1000)+ 1;
		while(num != guess)
		{
			System.out.println("Guess a number");
			guess = input.nextInt();
			
		}
		System.out.println("You guessed the number!");

		
	}
}
