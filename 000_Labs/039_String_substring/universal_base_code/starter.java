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
		System.out.println("Give me a word");
		String word = input.nextLine();
		for(int i = 0; i < word.length(); i ++){
			System.out.println(word.substring(i,i + 1));
		}


		
	}
}
