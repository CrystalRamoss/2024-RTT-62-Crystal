package GLAB_303_5_1;
import java.util.Scanner;

public class Practice_Assignment_303_5_1_Loops {
    public static void main(String[] args) {

        // 1. Print a Multiplication Table
        for (int i = 2; i < 10; i++) {
            System.out.println(" (" + i + "x )");
            for (int a = 1; a <= i; a++) {
                System.out.print(i + " x " + a + " = " + i * a);
            }
            System.out.println();
        }

        //2. Find the Greatest Common Divisor
                Scanner input = new Scanner(System.in);

                System.out.print("Enter first positive number: ");
                int n1 = input.nextInt();
                System.out.print("Enter second positive number: ");
                int n2 = input.nextInt();

                int gcd = n1 < n2 ? n1 : n2;

                while (n1 % gcd != 0 || n2 % gcd != 0) {
                    gcd--;
                }

                System.out.println("The greatest common divisor for " + n1 + " and " + n2 + " is " + gcd);

        //3. Print the Fibonacci Sequence
        double totalCost = 0;
        double tuition = 10000;
        int tuitionTenthYear = 0;

        for (int year = 1; year <= 14; year++) {

            tuition += (tuition * 0.07);

                totalCost += tuition;

            if (year == 10)
                tuitionTenthYear = (int)tuition;
        }

        System.out.println("Tuition in ten years: $" + tuitionTenthYear);

        System.out.println("Total cost for four years' worth of tuition" +
                " after the tenth year: $" + totalCost);
    }
}
