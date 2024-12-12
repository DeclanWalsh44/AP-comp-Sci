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
		myCharacter character = new myCharacter();
		System.out.println("Your role is a " + character.role);
		System.out.println("Your strength is "+ character.strength);
		System.out.println("You have " + character.intel + " intelegence");
		System.out.println("You have " + character.dex + " dexterity");
		System.out.println("You have " + character.cha + " charisma");

	}
}
