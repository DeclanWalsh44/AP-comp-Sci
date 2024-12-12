package pkg;

public class CVMath {		
	public static int findMid(int one, int two, int three)
	{
		return (one + two + three - Math.min(one,Math.min(two,three)) - Math.max(one,Math.max(two,three)));
	}
	public static void specialSquare(int nums){
		boolean special = false;
		double counter = 1.0;
		while(nums>0){
			special = false;
			int total = 0;
			while(special == false){
				if(Math.sqrt(counter) % 1.0 == 0){
					total = 0;
					for(double i = 1; i <counter; i ++){
						total += i;
						if(total == counter){
							nums--;
							special = true;
							i = counter;
						}
					}

					
				}
				counter++;
			}
			System.out.println(total);
		}
	}
		
	}

