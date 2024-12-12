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
		 int elem = (int)(Math.random() * 150) + 51;
		 int min = Integer.MAX_VALUE;
		 int max = Integer.MIN_VALUE;
		 int total = 0;
		int[] arr = new int[elem];
		for(int i =0; i < arr.length; i++){
			arr[i] = (int)((Math.random() *100) + 1);
		}
		for(int i = 0; i<arr.length;i++){
			if(arr[i] < min){
				min = arr[i];
			}
		}
		for(int i = 0; i<arr.length; i++){
			if(arr[i] > max){
				max = arr[i];
			}
		}
		for(int i = 0; i<arr.length; i++){
			total += arr[i];
		}
		System.out.println("The min value is " + min + ". The max value is " + max + ". The average " + (total/arr.length) + ". The total number of elements is " + arr.length);
	}
}
