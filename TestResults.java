package decision_structures;

import java.util.Scanner;

/*
 * IF-ELSE-IF
 * Display the letter grade for a student based on their test score
 */

public class TestResults {

    /*
     * static means that the variable or method belongs to TestResults class 
     * and not an object of the TestResults class
     */

    /*
     * Static Variables
     */

    static double score; // initialization
    static Scanner scanner = new Scanner(System.in);

    
    /*
     * Static Methods
     */
    
    //Get the test score
    static double userInput() {
        System.out.println("Enter your test score:");
        
        try {
            //Protected code
            score = scanner.nextDouble();
        } catch (Exception e) {
            //Catch block
            System.out.println("Exception thrown :"+ e);
            e.printStackTrace();
        }
        return score;
    }

    public static void main(String[] args) throws Exception {

        userInput();

        //Implement a validation for user input for test score in between 0 - 100.
        while (score > 100 || score < 0) {
            System.out.println("Please ENTER valid test score between 0 - 100");
            userInput();
        }

        //Close the scanner object, after validation successfull.
        // scanner.close();
        
        //Determine the letter grade.
        if (score >= 90 && score <= 100) {
            System.out.println("Your Grade is: A");
        } else if (score >= 80 && score < 90) {
            System.out.println("Your Grade is: B");
        } else if (score >= 70 && score < 80) {
            System.out.println("Your Grade is: C");
        } else if (score >=60 && score < 70) {
            System.out.println("Your score is: D");
        } else {
            System.out.println("Your Grade is: F");
        }
    }
} 
