 package decision_structures;

 import java.util.Scanner;

 /*
  * Program Requirements
  * Ask the User to Provide
  *     Number of pennies
  *     Number of nickels
  *     Number of dimes
  *     Number of quarters
  * Calculate and Print
  *     Count total value of the coins
  *     Print message informing them if they won or lost
  *     If they lost, let them know by how much they were over or under $1
  */

 
 public class ChangeForDollar {

     public static void main(String[] args) {

         System.out.println("\nWelcome to 'Change for a Dollar'! Your goal is to enter enough change to make exactly $1.00");
                 Scanner scanner = new Scanner(System.in);
                 System.out.println("\nEnter your number of pennies:");
                 int inputPennies = scanner.nextInt();

                 System.out.println("\nEnter your number of nickles:");
                 int inputNickles = scanner.nextInt();
                 int parsePenniesNickles = inputNickles * 5;

                 System.out.println("\nEnter your number of dimes:");
                 int inputDimes = scanner.nextInt();
                 int parsePenniesDimes = inputDimes * 10;
                    
                 System.out.println("\nEnter your number of quarters:");
                 int inputQuarters = scanner.nextInt();
                 int parsePenniesQuarters = inputQuarters * 25;
                 
                int totalPenniesAcquired = inputPennies + parsePenniesNickles + parsePenniesDimes + parsePenniesQuarters;

                if (totalPenniesAcquired == 100) {
                    System.out.println("\nYay! That's exactly $1.00! You win!");
                } else {
                    System.out.println("\nTry Again");
                    if (totalPenniesAcquired < 100) {
                        
                        int value = 100 - totalPenniesAcquired;
                        System.out.println("\nYou were under: " + value + " pennies");
                    } else if (totalPenniesAcquired > 100) {
                        int remainingAmount = totalPenniesAcquired - 100;
                        System.out.println("\nYou were over: " + remainingAmount + " pennies");
                    }
                }
     }
 }
