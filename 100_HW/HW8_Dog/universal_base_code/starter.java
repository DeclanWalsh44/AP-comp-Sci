/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Dog dog1 = new Dog("wills", 5);
		Dog dog2 = new Dog("Poppy", "boston terrior");
		if(dog1.isSleeping()){
			System.out.println("The dog is sleeping");
		}
		else{
			dog1.bark();
			if(dog2.isSleeping()){
				dog2.bark();
			}
			else{
				dog2.bark();
			}
		}


	}
}
