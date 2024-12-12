/*
 *	Author:Declan Walsh
 *  Date:09/17/24
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("What day of the week is it?(1-7)");
		int day = input.nextInt();
		if(day <=5)
		{
			System.out.println("It is a week day, Wake up at 7:00 AM");	
		}
		else
		{
			System.out.println("It is a weekend, Wake up at 10:00 AM");
		}
	}
}
