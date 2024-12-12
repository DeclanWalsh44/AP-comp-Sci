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
		BaseClass test = new BaseClass();
		int i = 0;
		int[] awry = new int[1000];
		while(i < 1000){
			awry[i] = (int) (Math.random() * 10);
			i++;
		}
		i = 0;
		while(i<1000){
			System.out.println(awry[i]);
			i++;
		}
	}
}
