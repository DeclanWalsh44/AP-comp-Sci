/* 
    Lecture note example - Classes
*/
package pkg;

public class Car{
    // Global Variables
    String model;
    double maxSpeed;
    boolean is Electric;
    String color;
    
    // Cinstructors
    public Car(){
        model = "Bus";
        maxSpeed = 1.1;
        isElectric = false;
        color = "Blue & red";
    }
    public Car(String m, double s, String c){
        model = m;
        maxSpeed = s;
        isElectric = false;
        color = c;
    }
    public void paint(String c){
        color = c;
    }
    public void vroom(){
        int count = 0;
        while(count < maxSpeed){
            System.out.println(model + " goes VROOOOOOMM");
            count = count + 10;
        }
    }

}