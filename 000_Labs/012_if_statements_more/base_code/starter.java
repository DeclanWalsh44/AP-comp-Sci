/*
 *	Author:  Declan Walsh
 *  Date: 9/3/24
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int i;
		int me;
		System.out.println("Gimme a int");
		i = input.nextInt();
		System.out.println("gimme anoder int");
		me = input.nextInt();
		
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		if(i == me){
			System.out.println(" THEY ARE THE SAME"); 
		}
		if(i != me){
			System.out.println("THEY ARE NOT THE SAME");	
		}
	}
}
