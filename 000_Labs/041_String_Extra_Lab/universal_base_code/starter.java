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
	System.out.println("Gimme a word or phrase or smin");
	String ans = input.nextLine();
	String reverse = "";
    int end = ans.length();
    for(int i = ans.length()-1; i >= 0; i--) {
    	//I tried using substring for the if statement but no workie so i searched up the problem and i tried chatAt and it works!!
    	if(ans.charAt(i) == ' ') {
            reverse += ans.substring(i+1, end) + " ";
            end = i;
    	}
    }
    reverse += ans.substring(0, end);
    System.out.print(reverse);
	}
}
