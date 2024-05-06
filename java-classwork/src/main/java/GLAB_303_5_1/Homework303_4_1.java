package GLAB_303_5_1;
import java.util.Scanner;

public class Homework303_4_1 {
    public static void main(String[] args) {
        // #1 - Write a program that declares 1 integer variable x, and then assigns 7 to it.
        //Write an if statement to print out “Less than 10” if x is less than 10.
        // Change x to equal 15, and notice the result (console should not display anything).


        int x = 7;

        if (x < 10) {
            System.out.println("Less than 10");
            x = 15;
        }
        // #2 Write a program that declares 1 integer variable x, and then assigns 7 to it.
        // Write an if-else statement that prints out “Less than 10” if x is less than 10,
        // and “Greater than 10” if x is greater than 10. Change x to 15 and notice the result.
        x = 7;

        if (x < 10){
            System.out.println("Less than 10");
        } else {
            System.out.println("Greater than 10");
        }

        // #3 Write a program that declares 1 integer variable x, and then assigns 15 to it. Write an if-else-if statement that prints out “Less than 10” if x is less than 10;
        // “Between 10 and 20” if x is greater than 10 but less than 20, and “Greater than or equal to 20” if x is greater than or equal to 20.
        // Change x to 50 and notice the result.
        x = 15;

        if (x > 10 && x < 20){
            System.out.println("Between 10 and 20");
        } else if ( x < 10 ){
            System.out.println("Less than 10");
        } else {
            System.out.println("Greater than or equal to 20");
        }

        // #4 Write a program that declares 1 integer variable x, and then assigns 15 to it.
        // Write an if-else statement that prints “Out of range” if the number is less than 10 or greater than 20 and
        // prints “In range" if the number is between 10 and 20 (including equal to 10 or 20). Change x to 5 and notice the result.
        x = 15;
        x = 5; // 2nd x change  "Change x to 5 and notice the result."

        if (x < 10 || x > 20){
            System.out.println("Out of range");
        } else {
            System.out.println("In range");
        }

        // #5 Write a program that uses if-else-if statements to print out grades A, B, C, D, F
        //Use the Scanner class to accept a number score from the user to determine the letter grade.
        // Print out “Score out of range” if the score is less than 0 or greater than 100.
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your grade: ");
        int grade = scan.nextInt();

        if (grade >= 90 && grade <= 100){
            System.out.println("A");
        } else if (grade <= 89 && grade >= 80){
            System.out.println("B");
        } else if (grade <= 79 && grade >= 70){
            System.out.println("C");
        } else if (grade <= 69 && grade >= 60){
            System.out.println("D");
        } else if (grade < 60 && grade >= 0) {
            System.out.println("F");
        } else {
            System.out.println("Score out of range");
        }

        // #6 Write a program that accepts an integer between 1 and 7 from the user. Use a switch statement to print out the corresponding weekday.
        // Print “Out of range” if the number is less than 1 or greater than 7. Do not forget to include “break” statements in each of your cases.
        System.out.println("Enter a number for the day of the week:");
        int day = scan.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }

        // #7 Create a program that lets the users input their filing status and income.
        // Display how much tax the user would have to pay according to status and income.
        System.out.println("Enter the corresponding number based on your filing status:");
        System.out.println("1. Single");
        System.out.println("2. Married Filing Jointly");
        System.out.println("3. Married Filing Separately");
        System.out.println("4. Head of Household");
        int filingStatus = scan.nextInt();

        System.out.println("Enter your income:");
        int income = scan.nextInt();

        if (income < 0){
            System.out.println("Invalid Input. Income cannot be negative");
        }

        double status10 = income * 0.10;
        double status15 = income * 0.15;
        double status25 = income * 0.15;
        double status28 = income * 0.28;
        double status33 = income * 0.33;
        double status35 = income * 0.35;

        if (filingStatus == 1) {
            if (income >= 0 && income <= 8350) {
                System.out.println("Total Owed: " + status10);
            } else if (income >= 8351 && income <= 33950) {
                System.out.println("Total Owed: " + status15);
            } else if (income >= 33951 && income <= 82250) {
                System.out.println("Total Owed: " + status25);
            } else if (income >= 82251 && income <= 171550) {
                System.out.println("Total Owed: " + status28);
            } else if (income >= 171551 && income <= 372950) {
                System.out.println("Total Owed: " + status33);
            } else {
                System.out.println("Total Owed: " + status35);
            }
        }

    }
}