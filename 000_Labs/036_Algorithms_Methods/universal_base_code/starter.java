/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	
	public static void toStringArray(int [] b){
		for(int i = 0; i < b.length; i++){
			System.out.print(b[i] + ", ");
		}
	}
	
	public static int getArrayAverage(int [] b){
		int sum = 0;
		for(int i = 0; i < b.length; i ++){
			sum += b[i];
		}
		return sum/b.length;
	} 
	
	public static int getArrayMax( int [] b){
		int max = Integer.MIN_VALUE;
			for(int i = 0; i<b.length; i++){
			if(b[i] > max){
				max = b[i];
			}
		}
		return max;
	}
	
	public static int getArrayMin(int [] b){
		int min = Integer.MAX_VALUE;
		for(int i = 0; i<b.length;i++){
			if(b[i] < min){
				min = b[i];
			}
		}
		return min;
	}
	
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		int [] arr = new int[100];
		for(int i =0; i < 100; i++){
			arr[i] = (int)((Math.random() *100) + 1);
		}
		toStringArray(arr);
		System.out.println("The average is: "+getArrayAverage(arr));
		System.out.println("The max is: " + getArrayMax(arr));
		System.out.println("The min is: " + getArrayMin(arr));
	}
}
