/* 
    Lecture note example - Methods
*/

class LectureMethod{
    public static void main(String args[]) {
        // Your Code Goes here!
        printAnimal();
        printAnimal();
        printAnimal();
        printAnimal();
        printAnimal();
        greeting("Declan");
        greeting("willson");
        greeting("jim");
        greeting("dasd");
        double num = raise(6000, 6);
        num = raise(num + 6000, 6);
        num = raise(num + 6000, 6);
        num = raise(num + 6000, 6);
        num = raise(num + 6000, 6);
        num = raise(num + 6000, 6);
        num = raise(num + 6000, 6);
        num = raise(num + 6000, 6);
        num = raise(num + 6000, 6);
        num = raise(num + 6000, 6);
        System.out.println(num);
	}
	
	public static void greeting(String name){
	    System.out.println("Salutations " + name);
	}
	
	public static void printAnimal(){
	    System.out.println("      |\\      _,,,---,,_");
	    System.out.println("ZZZzz /,`.-'`'    -.  ;-;;,_");
	    System.out.println("     |,4-  ) )-,_. ,\\ (  `'-'");
	    System.out.println("    '---''(_/--'  `-'\\_)  ");
	}
	
	public static double raise(double salary, int percent){
	   double amount = salary+ salary*(percent/100.0);
	   return amount;
	}
}