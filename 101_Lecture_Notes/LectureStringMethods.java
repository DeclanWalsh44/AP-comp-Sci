/* 
    Lecture note example - String Methods!
    length() - Returns the number of characters in a String
    substring(int) - Starts from the given int and returns to the end of the String
    substring(int, int) - Starts from the first int and returns until the last int (NOT including last int index)
    indexOf(String) - Returns the index of the first instance of a given String
    indexOf(String, int) - Returns the index of the first instance of a given String STARTING at the int index given
*/

import java.util.*;

class LectureStringMethods{
    public static void main(String args[]) {
        // Your Code Goes here!
        Scanner input = new Scanner(System.in);
        System.out.println("Hive me a sentance");
        String trains = input.nextLine();
        
        int space = trains.indexOf(" ");
        String word1 = trains.substring(0, space);
        int space2 = trains.indexOf(" ", space+1);
        String word2 = trains.substring(space+1, space2);
        
        System.out.println(word1);
        System.out.println(word2);
        
        while(true){
            if(trains.indexOf(" ") == -1){
                System.out.println(trains)
                break;
            }
            int spaces = trains.indexOf(" ");
            String word = trains.substring(0, space);
            System.out.println(word);
            trains = trains.substring(spaces+1);
        }
	}
}