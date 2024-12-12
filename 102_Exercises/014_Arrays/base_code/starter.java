/*
 *	Author:
 *  Date:
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		 int [] arr = new int [1001];
		 int [] arr2 = new int [1001];
		 int c = 3;
		 for(int i = 0; i <1001; i = i + 1){
		 	arr[i] = c;
		 	c= c + 3;
		 }
		 for(int i = 1000; i >0; i = i - 1){
		 	arr2[i] = i;
		 }
		 for(int i = 0; i <1001; i = i + 1){
		 	System.out.print(arr[i] + ",");
		 }
		 System.out.println("---------------------");
		 for(int i = 1000; i >0; i = i - 1){
		 	System.out.print(arr2[i] + ",");
		 }
	}
}
