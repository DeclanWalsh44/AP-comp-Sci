package pkg;

public class myCharacter{
	public String role;
	public int strength = 5;
	public int intel = 10;
	public int dex = 8;
	public int cha = 6;
	public myCharacter(){
		// role = "no role";
		// System.out.println("your role is: " + role);
		// System.out.println("Your strength is "+strength);
		// System.out.println("your intelegence is " +intel);
		// System.out.println("your dex is "+ dex);
		// System.out.println("your have " + cha + " charaizma");
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
		// System.out.println("Your strength is "+strength);
		// System.out.println("your intelegence is " +intel);
		// System.out.println("your dex is "+ dex);
		// System.out.println("your have " + cha + " charaizma");
		

	}
	public String setRole(String ro){
		role = ro;
		return(role);
	}
	public int setStrength(int st){
		if(st < 0){
			strength = 0;
		}
		else{
			strength = st;
		}
		return(strength);
	}
	public int setInt(int in){
		if(in < 0){
			intel = 0;
		}
		else{
			intel = in;
		}
		return(intel);
	}
	public int setDex(int de){
		if(de < 0){
			dex = 0;
		}
		else{
			dex = de;
		}
		return(dex);
	}
	public int setCha(int ch){
		if(ch < 0){
			cha = 0;
		}
		else{
			cha = ch;
		}
		return(cha);
	}
	public boolean setAll(String ro, int st, int in, int de, int ca){
		role = ro;
		strength = st;
		intel = in;
		dex = de;
		cha = ca;
		return true;
	}
	public void myToString(){
		System.out.println(role);
		System.out.println("Your strength is "+strength);
		System.out.println("your intelegence is " +intel);
		System.out.println("your dex is "+ dex);
		System.out.println("your have " + cha + " charaizma");
	}
}