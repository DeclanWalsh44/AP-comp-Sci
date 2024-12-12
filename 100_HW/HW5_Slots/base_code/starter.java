/*
 *	Author:Declan Walsh
 *  Date:10/1/24
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int money = 100;
		int bet;
		int rand1;
		int rand2;
		int rand3;
		String stay;
		while(money>0){
			System.out.println("You have $" + money);
			System.out.println("Do you want to bet?");
			stay = input.nextLine();
			if(stay.equalsIgnoreCase("Yes") || stay.equalsIgnoreCase("Y")){
				System.out.println("How much do you want to bet?");
				bet = input.nextInt();
				String adsa = input.nextLine();
				money = money-bet;
				rand1 = (int)(Math.random() * 10) + 1;
				rand2 = (int)(Math.random() * 10) + 1;
				rand3 = (int)(Math.random() * 10) + 1;
				if(rand1 == rand2 || rand1 == rand3 || rand2 == rand3){
					money = money + bet*2;
					System.out.println(rand1 + " | " + rand2 + " | " + rand3);
					System.out.println("you got 2 matching numbers! You get double your bet!");
				}
				else if(rand1 == rand2 && rand2 == rand3){
					System.out.println(rand1 + " | " + rand2 + " | " + rand3);
					money = money + bet*3;
					System.out.println("you got 3 matching numbers! You get tripple your bet!");
				}
				else{
					System.out.println(rand1 + " | " + rand2 + " | " + rand3);
					System.out.println("you got no matching numbers! You lost your bet!");
				}
			}
			else{
				break;
			}
		}
		System.out.println("You left with $" + money + "! Come back soon!");
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
	}
}
