/*
 *	Author:  Declan Walsh
 *  Date: 09/17/24
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner input = new Scanner(System.in);
		System.out.println("Giimeme a name");
		String name = input.nextLine();
		System.out.println("How many times do u want to see that name?");
		int num = input.nextInt();
		int c = 1;
		while(c <= num)
		{
			System.out.println(name);
			c++;
		}

		
	}
}
