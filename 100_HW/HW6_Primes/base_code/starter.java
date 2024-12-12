/*
 *	Author:
 *  Date:
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.println(checkPrime(12));
		System.out.print("Gimme a number: ");
		printPrime(input.nextInt());
	}
	
	public static boolean checkPrime(int a){
		int c = a;
		int pr = 0;
		while(c>2){
			c--;
			if(a%c == 0){
				pr++;
			}

		}
		if(pr >0){
			return false;
		}
		return true;
	}
	
	public static void printPrime(int a){
		int c = a;
		int c2;
		int a2;
		int pr2 = 0;
		int pr = 0;
		while(c > 1){

		if(checkPrime(c) == true){
			System.out.println(c);
		}
		c--;
	}
}
}
