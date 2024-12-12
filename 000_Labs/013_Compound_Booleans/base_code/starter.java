/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		int num1;
		int num2;
		int num3;
		Scanner input = new Scanner(System.in);
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.println("Gimmie a int");
		num1 = input.nextInt();
		System.out.println("Gimmie a second int");
		num2 = input.nextInt();
		System.out.println("Gimmie a third int");
		num3 = input.nextInt();
		if(num1 > num2 && num1 > num3){
			System.out.println("Your first number is the largest");
		}
		else if(num2 > num1 && num2 > num3){
			System.out.println("Your Second number is the largest");
		}
		else if(num3 > num2 && num3 > num1){
			System.out.println("Your Third number is the largest");
		}
		else{
			System.out.println("They are the same");
		}
		if(num1 < num2 && num1 < num3){
			System.out.println("Your first number is the smallest");
		}
		else if(num2 < num1 && num2 < num3){
			System.out.println("Your second number is the smallest");
		}
		else if(num3 < num1 && num3 < num2){
			System.out.println("Your third number is the smallest");
		}
		else{
			System.out.println("They are the same");
		}
	}
}
