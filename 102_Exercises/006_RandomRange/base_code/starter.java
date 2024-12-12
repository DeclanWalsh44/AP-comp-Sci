/*
 *	Author:Declan Walsh
 *  Date:9/16/24
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int num1;
		int num2;
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.println("Gimme an int"); 
		num1 = input.nextInt();
		System.out.println("Gimme a second int. LARGER THEN THE FIRST ONE");
		num2 = input.nextInt();
		System.out.println("Your range is " + num1 + " to "+ num2);
		System.out.println("5 random numbers between that range are: " + (int)((Math.random()*(num2-num1))+(num1)) + ", " + (int)((Math.random()*(num2-num1))+(num1)) + ", " + (int)((Math.random()*(num2-num1))+(num1)) + ", " + (int)((Math.random()*(num2-num1))+(num1)) + ", " + (int)((Math.random()*(num2-num1))+(num1)));
	}
}
