package pkg;

public class myCharacter{
	public String role;
	public int strength = 5;
	public int intel = 10;
	public int dex = 8;
	public int cha = 6;
	public myCharacter(){
		role = "no role";
		System.out.println("your role is: " + role);
		System.out.println("Your strength is "+strength);
		System.out.println("your intelegence is " +intel);
		System.out.println("your dex is "+ dex);
		System.out.println("your have " + cha + " charaizma");
	}
	public myCharacter(String a){
		if(a.equalsIgnoreCase("wizard")){
			role = a;
			System.out.println("You chose a wizard. trying to make up for your lack of brains?");
		}
		else if(a.equalsIgnoreCase("Rouge")){
			role = a;
			System.out.println("You chose a rouge? makes sense cuz no one noteces u in real life too");
		}
		else if(a.equalsIgnoreCase("Warrior")){
			role = a;
			System.out.println("You picked a warrior? maken up for ur tiny weak little baby arms?");
		}
		else{
			System.out.println("No role");
		}
		System.out.println("Your strength is "+strength);
		System.out.println("your intelegence is " +intel);
		System.out.println("your dex is "+ dex);
		System.out.println("your have " + cha + " charaizma");

	}
	public void myToString(){
		System.out.println(role);
		System.out.println("Your strength is "+strength);
		System.out.println("your intelegence is " +intel);
		System.out.println("your dex is "+ dex);
		System.out.println("your have " + cha + " charaizma");
	}
}