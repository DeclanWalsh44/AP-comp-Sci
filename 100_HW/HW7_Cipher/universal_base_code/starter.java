/*
 *	Author:
 *  Date:
 *	Collaborator(s):
*/

import pkg.*;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Cipher mess = new Cipher();
		System.out.println(mess.keyedEncode("Mission Failed We'll get em next time." , 16));

	}
}
