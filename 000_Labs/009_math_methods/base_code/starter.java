/*
 *	Author:  Declan Walsh
 *  Date: 9/3/24
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		double x;
		double y;
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.println("Maximum: " + Math.max(13-6*11,30%7*(-2))); 
		System.out.println("Square Root: " + Math.sqrt(3*8+31%7));
		System.out.println("Power: " + Math.pow(37/3,35%21));
		System.out.println("Max: " + Math.max(Math.pow(2,14%3),Math.sqrt(2*6)));
		System.out.println("Give me a double");
		x = input.nextDouble();
		System.out.println("Give me another number");
		y = input.nextDouble();
		System.out.println("The max of x and y is " + Math.max(x,y));
		System.out.println("The square root of y is " + Math.sqrt(y));
		System.out.println("The power of x adn y is " + Math.pow(x,y));
	}
}
