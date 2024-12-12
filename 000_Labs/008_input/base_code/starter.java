import java.util.Scanner;
/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		String name;
		int age;
		String month;
		int day;
		int year;
		Double mulah;
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.println("What is your first name?"); 
		name = input.nextLine();
		System.out.println("How old are you?");
		age = input.nextInt();
		String ahaha = input.nextLine();
		System.out.println("What month were u born?");
		month = input.nextLine();
		System.out.println("What day of the month were you born");
		day = input.nextInt();
		System.out.println("What year were u born?");
		year = input.nextInt();
		System.out.println("How much is a buck fifty?");
		mulah = input.nextDouble();
		System.out.println("Your name is " + name + ". You are " + age + " years old. You were born on " + month + ' ' +  day + " " + year + ". And a buck fifty is worth $" + mulah);
	}
}
