package decision_structures;

import java.util.Scanner;

/*
If statement.
All salespeople get a payment of $1000 a week.
Salespeople who exceeds 10 sales get an additional bonus of $250.
*/

/*
If Statement.
If a certain situation occers, do something and
    then go back to the main flow.
*/

public class SalaryCalculator {


    public static void main(String[] args) {

        //Initialize known values
        int salary = 1000;
        int bonus = 250;
        int quota = 10;

        //Get values for the unknown
        System.out.println("How many sales did the employee make this week?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //Quick detour for the bonus earners
        if (sales > quota) {
            salary = salary + bonus;
            // if (sales > quota) salary = salary + bonus;
        }

        //Output
        System.out.println("The employee's pay is $" + salary);
    }
}


