/*
 * Author:  Declan Walsh
 *  Date:9/11/24
*/

import java.util.Scanner;
import java.util.Random;

class starter {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
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
    }
}
