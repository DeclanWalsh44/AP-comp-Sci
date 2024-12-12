/*
   * Author:
   * Date:
   * Collaborator(s):
*/
import java.util.*;

class starter {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Gimme a phrase or something to that affect: ");
		String ans = input.nextLine();
		while(true){
			if(ans.indexOf(" ") == -1){
				System.out.print(pigLatts(ans) + " ");
				break;
			}
			int space = ans.indexOf(" ");
			String word = ans.substring(0,space);
			System.out.print(pigLatts(word) + " ");
			
			ans = ans.substring(space+1);
		}
	}
	public static String pigLatts(String word){
		String result = "";
		for(int i = 0; i < 1; i++){
			String letter = word.substring(i,i+1);
			if(letter.equalsIgnoreCase("a") || letter.equalsIgnoreCase("e") || letter.equalsIgnoreCase("i") || letter.equalsIgnoreCase("o") || letter.equalsIgnoreCase("u")){
				result = word + "-way";
			}
			if(!(letter.equalsIgnoreCase("a")) && !(letter.equalsIgnoreCase("e")) && !(letter.equalsIgnoreCase("i")) && !(letter.equalsIgnoreCase("o")) && !(letter.equalsIgnoreCase("u"))){
				letter = word.substring(i+1,i+2);
				if(!(letter.equalsIgnoreCase("a")) && !(letter.equalsIgnoreCase("e")) && !(letter.equalsIgnoreCase("i")) && !(letter.equalsIgnoreCase("o")) && !(letter.equalsIgnoreCase("u"))){
					result = word.substring(i+2) + "-" + word.substring(i, i+2) + "ay";
				}
				else{
					result = word.substring(i+1) + "-" + word.substring(i, i+1) + "ay";
				}
			}
		}
		return result;
	}
}
