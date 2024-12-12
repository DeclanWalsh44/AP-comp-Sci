/*
	Author:
	Date:
*/
import java.util.*;

class starter {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("gimme a saying or word or smtin: ");
		String ans = input.nextLine();
		while(true){
			if(ans.indexOf(" ") == -1){
				System.out.print(spongeCase(sentence) + " ");
				break;
			}
			int space = ans.indexOf(" ");
			String word = ans.substring(0,space);
			System.out.print(spongeCase(word) + " ");
			
			ans = ans.substring(space+1);
		}
		public static String spongeCase(String ans){
			String result = "";
			for(int i = 0; i < ans.length(); i ++){
				String letter = ans.substring(i,i+1);
				if(i % 2 ==0){
					letter = letter.toLowerCase();
				}
				else{
					letter = letter.toUpperCase();
				}
				result = result+letter;
		}
		return result;
		}
	}
}
}