/*
 *	Author:  Declan Walsh
 *  Date: 9/24/24
*/

import java.util.Scanner;
import java.util.Random;

class character {
	String role = ("Wizard");
	int strength = 5;
	int intel = 10;
	int dex = 8;
	int cha = 7;
}

class starter {
	public static void main(String args[]) {
		character myChar = new character();
		System.out.println("you are a " + myChar.role);
		System.out.println("You have " + myChar.strength + " strength");
		System.out.println("You have " + myChar.intel + " intelegence");
		System.out.println("You have " + myChar.dex + " dexterity");
		System.out.println("You have " + myChar.cha + " charisma");



		
	}
}
