import java.util.*;
import java.io.*;

class starter {
	public static void main(String args[]) throws Exception {
		//Creating File instance to reference text file in Java
        File text = new File("./passwords.txt");			// This file must be in the same folder as your java/class files.
     
        //Creating Scanner instance to read File in Java
        Scanner numLines = new Scanner(text);			// Scanner for counting number of lines
        Scanner sc = new Scanner(text);					// New Scanner for taking in the lines.
     
	 	// Count number of lines in text file.
		int count = 0; 
        while(numLines.hasNextLine()){		//Checks if there's a nextLine, breaks if none found.
			numLines.nextLine();
            count++;
        }  
		
		String [] passwords = new String[count];		// This is the array you will be using.

        //Reading each line of the file using Scanner class
		int i = 0;
        while(sc.hasNextLine()){		//Checks if there's a nextLine, breaks if none found.
            String line = sc.nextLine();
            passwords[i] = line;
			i++;
        }  

		/* ----------------------------------------------------------------------------------------- */
		// Start here, use the array passwords
		int strength1 = 0;
		int strength2 = 0;
		int strength3 = 0;
		int none = 0;
		int num = 0;
		for(int y = 0; y < passwords.length; y ++){
			num = 0;
		    if(passwords[y].length() >=8){
		        strength1++;
		        num++;
		        if(passwords[y].indexOf("!") != -1 || passwords[y].indexOf("@") != -1 || passwords[y].indexOf("#") != -1 || passwords[y].indexOf("$") != -1 || passwords[y].indexOf("%") != -1 || passwords[y].indexOf("^") != -1 ||passwords[y].indexOf("&") != -1 || passwords[y].indexOf("*") != -1){
		            strength3++;
		        }
		    }
		    if(passwords[y].indexOf("!") != -1 || passwords[y].indexOf("@") != -1 || passwords[y].indexOf("#") != -1 || passwords[y].indexOf("$") != -1 || passwords[y].indexOf("%") != -1 || passwords[y].indexOf("^") != -1 ||passwords[y].indexOf("&") != -1 || passwords[y].indexOf("*") != -1){
		            num++;
		            strength2++;
		    }
		    if(num == 0){
		    	none++;
		    }
		}
		System.out.println("Their are " + (strength1 - strength3) + " passwords what are at least 8 characters");
		System.out.println("Their are " + (strength2 - strength3) + " passwords that have one of the following symbols: ! @ # $ % ^ & *");
		System.out.println("Their are " + strength3 + " passwords that have both strength level 1 and level 2");
		System.out.println("THeir are " + none + " passwords that have neither strengths");
	}
}
