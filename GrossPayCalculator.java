
// Package: Folder or container that holds Java files
// package option serves as a folder to organize Java files
// package declaration

package gross_calculator;

// classes from other packages
import java.util.Scanner;

// package contains java files, also known as classes
// class option represents a Java file
// class declaration

public class GrossPayCalculator {

// the curly braces are used to encompass a block of code

	
	// main method
	// the entry point for running a program in Java
	// When we execute this class, it's going to look for the main method within this class, and
	// this is the starting point of the program
	public static void main(String[] args) {

		//1. Get the number of hours worked
		
		// ---------------Declare it ---------------------
		// Variable: Memory location that stores data
		
		
		// Java: Statically typed
		// Variable types must be declared before the program can be compiled
		
		// Local Variable: Type inference
		// While Java is statically typed language, it offers type inference for local variables,
		// which means we can declare a variable VAR and java will infer the data type based on
		// what is assigned to the variable

		// Example:
		var isWaterWet = true; // When using VAR, you must initialize the variable at the time of declaration.
		// Type inferences only allows for local variables,
		// Local variables are variables that are declared within a method.
		// You cannot use VAR for declaring a global variable, which is a variable that is defined
		// at the class level outside of the methods of the class.

			
		// JavaScript: Dynamically typed
		// Variable types are determined at runtime through context in the code

		
		// Different types of data use different amounts of memory.
		// This is variable declaration
		
		//int hours = 40;
		// Hard-Coded Variables: The values are the same every time this program is executed.
		// instead of hard coding the value for hours, let's instead set the varible to default value of zero
		// and then ask the user to enter the number of hours worked

		
		int hours = 0; // The values of most varibles will vary.
		// ^--- When given a default value to a variable, this is known as initialization.
		System.out.println("How many hours did you work?");
		
		// Now to read data from the user, we can use a scanner
		Scanner scanner = new Scanner(System.in);
		hours = scanner.nextInt();	

		//2. Get the hourly pay rate
		
		//double payRate = 25.50;
		// Modifying variables from Hard-Coded Variables
		double payRate = 0;
		System.out.println("What is your pay rate?");
		payRate = scanner.nextDouble();
		
		// let's go ahead and close the scanner since we don't need to read anymore input
		scanner.close();

		//3. Multiply hours and pay rate
		double grossPay = hours * payRate;

		//4. Display result
		System.out.println("Gross pay: " + grossPay);

		
		// Example: Local variable type inferences
		// System.out.println("Local variable type inferences: " + isWaterWet);
		
		
	}
}
