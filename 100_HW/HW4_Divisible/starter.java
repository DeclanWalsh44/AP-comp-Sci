/*
 *	Author:Declan Walsh
 *  Date:09/23/24
 * 	Collaborator: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		
		System.out.println("Give me one int");
		int num1 = input.nextInt();
		System.out.println("Gimme another int");
		int num2 = input.nextInt();
		if(num1 %2 == 0){
			System.out.println("Your first number is even");
		}
		else{
			System.out.println("Your first number is odd");
		}
		if(num2%2 == 0){
			System.out.println("Your second number is even");
		}
		else{
			System.out.println("Your second number is odd");
		}
		if(num1%3 == 0){
			System.out.println("Your first number is divisible by 3");
		}
		else{
			System.out.println("You first numebr is not divisible by 3");
		}
		if(num1%4 == 0){
			System.out.println("Your first number is divisible by 4");
		}
		else{
			System.out.println("Your first number is not divisible by 4");
		}
		if(num1%5 == 0){
			System.out.println("Your first number is divisible by 5");
		}
		else{
			System.out.println("Your second number is not divisible by 5");
		}
		if(num2%3 == 0){
			System.out.println("Your second number is divisible by 3");
		}
		else{
			System.out.println("You second numebr is not divisible by 3");
		}
		if(num2%4 == 0){
			System.out.println("Your second number is divisible by 4");
		}
		else{
			System.out.println("Your second number is not divisible by 4");
		}
		if(num2%5 == 0){
			System.out.println("Your second number is divisible by 5");
		}
		else{
			System.out.println("Your second number is not divisible by 5");
		}
	}
}
