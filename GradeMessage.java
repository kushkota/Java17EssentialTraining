package decision_structures;

import java.util.Scanner;

/*
 * SWITCH 
 * Have a user enter their letter grade, and using a switch expression,
 * print out a message letting them know how they did.
 *
 * Switch Expressions
 * Directly assign a value to a variable when a case is matched
 * they do not need a break statement as there is no fall through like with switch statements.
 */

public class GradeMessage {

    public static void main(String[] args) {

        System.out.println("\nEnter your letter grade:");

        Scanner scanner = new Scanner(System.in);

        String grade = scanner.next();

        scanner.close();

        String message = switch (grade) {
            case "A" -> "Excellent jobs!";
            case "B" -> "Great job!";
            case "C" -> "Good job!";
            case "D" -> "You need to work a bit harder";
            case "F" -> "Uh oh!";
            default -> "Error. Invalid grade";
        };

        System.out.println("\n"+message);
    }
}
            
