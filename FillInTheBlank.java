package story;

import java.util.Scanner;

public class FillInTheBlank {


public static void main(String[] args) {

	
Scanner scanner = new Scanner(System.in);

System.out.println("What is your favorite season to drink a coffee?");
String season = null;
season = scanner.next();

String weather = null;

// Right way to compare String in Java
// call equals() on String literal, this will help you to
// avoid NullPointerException

// let's see what happens when we compare String for equality using
// == operator, it will return true if both String point to same
// object e.g. interned String or String literal, otherwise it will
// return false, even if two String contains same characters and has same length

// "winter".equals(season)
// Right way of using equals() method with String literal



// if you want to perform  case insensitive comparison between
// two String, then use equalsIgnoreCase() method of String class

if ("winter".equalsIgnoreCase(season)) {
weather = "cold";
} else { 
weather = "hot";
}

System.out.println("What is the minimum cup of coffee you drink on your favorite season?");
int number = 0;
number = scanner.nextInt();

scanner.close();


System.out.println("On a " + weather + " " + season + " day,\n" +
"I drink a minimum of " + number + " cups\n" + "of coffee.");


}


}
