package org.example;

import org.w3c.dom.ls.LSOutput;

public class Homework303_2_1 {

    public static void main(String[] args) {

        //----------------------------Int Sum Program----------------------------------------------
        System.out.println("-----------------------------");
        //Write a program that declares two integer variables, assigns an integer to each, and adds them together.
        //Assign the sum to a variable. Print out the result.
        int num1 = 10;
        int num2 = 20;

        int sum = num1 + num2;
        System.out.println("The sume of " + sum);

        //----------------------------2 Doubles Program----------------------------------------------
        System.out.println("-----------------------------");
        //Write a program that declares two double variables, assigns a number to each, and adds them together.
        //Assign the sum to a variable. Print out the result.
        double d1 = 10.5d;
        double d2 = 20.5d;

        System.out.println(d1 + d2);

        //----------------------------Int and double Sum Program----------------------------------------------
        System.out.println("-----------------------------");
        //Write a program that declares an integer variable and a double variable, assigns numbers to each, and adds them together. Assign the sum to a variable.
        //Print out the result. What variable type must the sum be?

        int e1 = 10;
        double e2 = 20.5d;
        double sum3 = e1 + e2;

        System.out.println(sum3);

        //----------------------------Int to Double Program----------------------------------------------
        System.out.println("-----------------------------");
        //Write a program that declares two integer variables, assigns an integer to each, and divides the larger number by the smaller number. Assign the result to a variable.
        //Print out the result. Now change the larger number to a decimal. What happens? What corrections are needed?
        int f1 = 80;
        int f2 = 50;
        double sum4 = (double)f1 / (double)f2;

        System.out.println(sum4);

        //----------------------------Double Cast Program----------------------------------------------
        System.out.println("-----------------------------");
        //Write a program that declares two double variables, assigns a number to each, and divides the larger by the smaller number. Assign the result to a variable.
        //Print out the result. Now, cast the result to an integer. Print out the result again.
        double g1 = 50.5d;
        double g2 = 25.5d;
        double total = g1 + g2;
        System.out.println(total);
        int sum5 = (int)g1 / (int)g2;

        System.out.println(sum5);

        //----------------------------Cast Program----------------------------------------------
        System.out.println("-----------------------------");
        //Write a program that declares two integer variables, x and y, and assigns the number 5 to x and the number 6 to y.
        //Declare a variable q and assign y/x to it and print q. Now, cast y to a double and assign it to q. Print q again.
        int x = 85;
        int y = 6;
        double q = y/x;
        System.out.println(q);

        q = (double)y / x;
        System.out.println(q);

        //----------------------------Constant Program----------------------------------------------
        System.out.println("-----------------------------");
        //Write a program that declares a named constant and uses it in a calculation. Print the result.

        final double CONSTANT_NAME = Math.sqrt(10);
        System.out.println(CONSTANT_NAME);


        //----------------------------Cafe Program----------------------------------------------
        System.out.println("-----------------------------");
        //Write a program where you create three variables that represent products at a cafe. The products could be beverages like coffee, cappuccino, espresso, green tea, etc.
        // Assign prices to each product. Create two more variables called subtotal and totalSale
        // and complete an “order” for three items of the first product, four items of the second product,
        // and two items of the third product. Add them all together to calculate the subtotal. Create a
        // constant called SALES_TAX and add sales tax to the subtotal to obtain the totalSale amount.
        // Be sure to format the results to two decimal places.

        int coffee = 3;
        int cappuccino = 5;
        double espresso = 6.50;

        double subtotal = (coffee * 3) + (cappuccino * 4) + (espresso * 2);
        double totalSale = subtotal * 0.08;

        System.out.println("Your Order: \nCoffee(3): $" + coffee * 3);
        System.out.println("Cappuccino(4): $" + cappuccino * 4);
        System.out.println("Espresso(2): $" + espresso * 2);
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Total Sale: $" + totalSale);



        //----------------------------Cafe Program (End)----------------------------------------------
    }
}
 