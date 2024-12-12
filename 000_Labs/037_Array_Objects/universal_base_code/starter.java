/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Warrior [] war = new Warrior[100];
		Wizard [] wiz = new Wizard[100];
		for(int i = 0; i < war.length ; i++){
			war[i] = new Warrior();
			wiz[i] = new Wizard();
		}
		int i = 0;
		int b = 0;
		while(!(war[war.length - 1].isDead()) && !(wiz[wiz.length - 1].isDead())){
			if(i >=100){
				i--;
			}
			
			while(!(war[b].isDead()) && !(wiz[i].isDead())){
				wiz[i].attack(war[b]);
				if(war[b].isDead()){
					b++;
					if(b>=100){
						b--;
					}
				}
				war[b].attack(wiz[i]);
			}
			if(wiz[i].isDead()){
				i++;
			}
		}
		if(wiz[wiz.length - 1].isDead()){
			System.out.println("The warriors won with " + (war.length - b) + " Soldiers left");
		}
		else{
			System.out.println("The wizards won with " + (wiz.length - i) + " Wizards  left");
		}
	}
}
