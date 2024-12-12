/*
 *	Author:Declan Walsh
 *  Date:9/11/24
 *	Collaborator(s): 
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("GImmie a int: ");
		int num = input.nextInt();
		System.out.println("The next five numbers are: " + num + " " + (num+1) + " " + (num+2) + " " + (num +3) + " " + (num+4) + " ");
		System.out.println("The next five multipules of "+ num+ " are: " + num+" "+  num*2 + " "+ num*3 + " " + num*4 + " "+ num*5);
		System.out.println(num + " divided by 100 is: " + num/100.0);
		System.out.println(num + " divided by 10 is: " + num/10.0);
	}
}
