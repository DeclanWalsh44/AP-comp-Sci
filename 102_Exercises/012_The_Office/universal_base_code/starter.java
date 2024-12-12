/*
 *	Author:
 *  Date:
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee michael = new Employee();
		michael.employeeToString();
		Employee Dwight = new Employee(1987, "Dwight", " Schrute", 4416.66);
		Employee Jim = new Employee(2474, "Jim", " Halpert", 4416.66);
		Employee Pam = new Employee(2011, "Pam", " Beesly", 2250);
		Employee Issac = new Employee(2029, "Issac", " Porath", 127.73);
		michael.raiseSalary(15);
		Dwight.raiseSalary(25);
		Jim.raiseSalary(5);
		Pam.raiseSalary(2);
		Issac.raiseSalary(1);
		michael.employeeToString();
		System.out.println("Michale's annual sallary: "+michael.getAnnualSalary());
		Dwight.employeeToString();
		System.out.println("Dwight's annual sallary: "+Dwight.getAnnualSalary());
		Jim.employeeToString();
		System.out.println("Jim's annual sallary: " +Jim.getAnnualSalary());
		Pam.employeeToString();
		System.out.println("Pam's annual sallary: " +Pam.getAnnualSalary());
		Issac.employeeToString();
		System.out.println("Issac's annual sallary: " +Issac.getAnnualSalary());
	}
}
