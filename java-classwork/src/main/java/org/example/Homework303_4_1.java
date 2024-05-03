package org.example;
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

        // #6


    }
}