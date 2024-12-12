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
		character.setRole("Wizard");
		character.setStrength(5);
		character.setInt(5);
		character.setDex(5);
		character.setCha(5);
		character.myToString();
		character.setAll("Warrior",1,5,6,1);
		character.myToString();
	}
}
