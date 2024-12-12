/* 
    Lecture note example - Classes
*/
import pkg.*;
import java.util.*;

class starter{
    public static void main(String args[]) {
        // Your Code Goes here!
        Car mobile = new Car();
        Car batMobile = new Car("Lambo", 525, "Black");
        batMobile.paint("pink w/ glitter");
        mobile.vroom();
        batMobile.vroom();
	}
}