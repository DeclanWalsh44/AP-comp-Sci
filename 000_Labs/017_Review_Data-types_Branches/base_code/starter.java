/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int points = 20;
		System.out.println("What is your characters name?");
		String name = input.nextLine();
		System.out.println("What is your title?");
		String title = input.nextLine();
        System.out.println("What do you want to be, a Wizard, A Warrior, or a Rouge? ");
        String choice = input.nextLine();
        if(choice.equalsIgnoreCase("Wizard")){
            System.out.println("Wizards are weak little babys they have very little hp but do a lot of damage from range with spells.");
        }
        else if(choice.equalsIgnoreCase("Warrior")){
            System.out.println("Warriors are big muscley people who like to get up close with people and bonk them on the head with a sword.");
        }
        else if(choice.equalsIgnoreCase("rouge")){
            System.out.println("Rouge's are sneaky sneaky people who are good at stealing things and they sneak up on their opponents to upprize them.");
        }
        else{
            System.out.println("U MISTYPED HEHHEE");
        }
        System.out.println("You have 20 points. How many do you want to put into strength? (1-10)");
        int strength = input.nextInt();
        if(strength > 10){
        	System.out.println("You mistyped so put less then 10 this time");
        	strength = input.nextInt();
        	if(strength > 10){
        		System.out.println("You mistyped again so me put 0 in it fur u! (:");
        		strength = 0;
        	}
        }
        points = points - strength;
        System.out.println("You have "+ points+ " points remaining. How many do you want to put into Dexterity? (1-10)");
        int dex = input.nextInt();
        if(dex > 10 ){
        	System.out.println("You mistyped so put less then 10 this time");
        	dex = input.nextInt();
        	if(dex > 10){
        		System.out.println("You mistyped again so me put 0 in it fur u! (:");
        		dex = 0;
        	}
        }
        points = points - dex;
        System.out.println("You have "+ points+ " points remaining. How amny do you want to put into Intelegence? (1-10)");
        int inte = input.nextInt();
        if(inte > points){
        	System.out.println("You mistyped so put less then ur remaining points this time");
        	inte = input.nextInt();
        	if(inte > points){
        		System.out.println("You mistyped again so me put 0 in it fur u! (:");
        		inte = 0;
        	}
        }
        points = points - inte;
        System.out.println("You have "+ points+ " points remaining. How amny do you want to put into Charizma? (1-10)");
        int Char = input.nextInt();
        if(Char > points){
        	System.out.println("You mistyped so put less then ur remaining points this time");
        	Char = input.nextInt();
        	if(Char > points){
        		System.out.println("You mistyped again so me put 0 in it fur u! (:");
        		inte = 0;
        	}
        }
        System.out.println("Your name is: " + name + " " + title);
        System.out.println("You are a " + choice);
        System.out.println("Strength: " + strength);
        System.out.println("Dexterity: " + dex);
        System.out.println("Intelegence: " + inte);
        System.out.println("Charizma: " + Char);
	}
}
