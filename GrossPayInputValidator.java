package repetition_structures;

import java.util.Scanner;

/*
 * Each store employee makes $15 an hour.
 * Write a program that allows a manager to enter the number
 * of weekly hours worked for each employee and calculate 
 * their pay.
 * Do not allow for overtime.
 */

public class GrossPayInputValidator {
    
    //Initialization
    static String name;
    static double hours;
    
    //Initialize known variables
    static int maxHours = 40;
    static int pay = 15;

    static Scanner scanner = new Scanner(System.in);
    
    /*
     * Static Methods
     */

    static void gameLoop() {
        System.out.println("Enter employee name.");
        name = scanner.next();

        System.out.println("Enter employee hours.");
        hours = scanner.nextDouble();

        //Validate input
        while (hours > maxHours) {
            System.out.println("Invalid entry. Your hours must be between 1 and 40. Try again");
            hours = scanner.nextDouble();
        }
        
        //Calcuate gross
        double gross = hours * pay;
        System.out.println(name + ", your gross pay is: $" + gross);
        ask();
    }

    static void ask() {
        System.out.println("Do you want to continue? [Y/n]");
        String input = scanner.next();
        if (input.equals("y") || input.equals("Y")) {
            gameLoop();
        }
        else {
            scanner.close();
            System.out.println("Abort!");

        }
    }

    public static void main(String[] args) {
        gameLoop();
    }
}
