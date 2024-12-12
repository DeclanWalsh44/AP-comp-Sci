/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner input = new Scanner(System.in);
		BaseClass test = new BaseClass();
		System.out.println("Gimme a first and last name ");
		String name = input.nextLine();
		int space = name.indexOf(" ") + 1;
		System.out.println(name.substring(space,name.length()));


		
	}
}
