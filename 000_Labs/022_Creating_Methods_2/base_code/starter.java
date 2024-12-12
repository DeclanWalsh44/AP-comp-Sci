/*
 *	Author:  Declan Walsh
 *  Date: 9/17/24
*/

import java.util.Scanner;
import java.util.Random;

class starter {

	public static int pow(int num1, int num2)
	{
		int c = 0;
		int num = num1;
		while(c < num2-1){
			num = num*num1;
			c++;
		}
		return num;	
	}
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("gimme a base int");
		int num1 = input.nextInt();
		System.out.println("Gimme a int");
		int num2 = input.nextInt();
		System.out.println(pow(num1,num2));
		// Your code goes below here



		
	}
}
