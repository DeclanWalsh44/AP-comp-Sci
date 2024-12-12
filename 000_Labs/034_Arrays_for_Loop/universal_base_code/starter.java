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
		int[] awry = new int[1000];
		for(int i = 0; i<1000;i++){
			awry[i] = (int) (Math.random() * 10);
		}
		for(int i = 0; i<1000;i++){
			System.out.println(awry[i]);
		}
		
	}
}
