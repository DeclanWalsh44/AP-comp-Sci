/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
		int [] arr = new int[20];
		int target = (int)(Math.random() * 10) + 1;
		int total = 0;
		for(int i = 0; i < arr.length; i++){
			arr[i] = (int)(Math.random() * 10) + 1;
			if(arr[i] == target){
				total++;
				System.out.println("Index " + i + " is a duplicate of " + target);
			}
		}
		System.out.println("There were " + total + " duplicates");
		for(int i = 0; i < arr.length; i++){
				if(i < 19){
				if(arr[i] == arr[i+1]){
					System.out.println("Indexes " + i + " and " + (i+1) + " are both " + arr[i]);
				}
			}
		}
		System.out.println("the numbers were: ");
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
	}
}
