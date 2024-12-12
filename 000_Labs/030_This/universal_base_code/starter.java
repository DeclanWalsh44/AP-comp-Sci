/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static String randName(){
		int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
            default: return "Happy";
		}
	}

	public static void main(String args[]) {
		// Your code goes below here
		int c = 0;
		PooleDwarf test = new PooleDwarf(randName(),69);
		PooleDwarf name2 = new PooleDwarf(randName(), 69);
		PooleDwarf name3 = new PooleDwarf(randName(), 69);
		PooleDwarf name4 = new PooleDwarf(randName(), 69);
		PooleDwarf name5 = new PooleDwarf(randName(), 69);
		PooleDwarf name6 = new PooleDwarf(randName(), 69);
		PooleDwarf name7 = new PooleDwarf(randName(), 69);
		
		if(test.isSameName(name2.getName())){
			c ++;
		}
		if(test.isSameName(name3.getName())){
			c ++;
		}
		if(test.isSameName(name4.getName())){
			c ++;
		}
		if(test.isSameName(name5.getName())){
			c ++;
		}
		if(test.isSameName(name6.getName())){
			c ++;
		}
		if(test.isSameName(name7.getName())){
			c ++;
		}
		System.out.println(test.getName() + " was the name and had " + c + " matches.");
	}
}
