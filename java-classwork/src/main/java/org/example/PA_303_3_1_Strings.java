package org.example;

import java.util.Scanner;

public class PA_303_3_1_Strings {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        String A =sc.next();
        String B =sc.next();
        /* Enter your code here. Print output to STDOUT. */

        int aLength = A.length();
        int bLength = B.length();

        int sum = aLength + bLength;
        System.out.println("Sum: " + sum);

        int compare = A.compareTo(B);

        if (compare > 0){
            System.out.println("Yes");
        } else{
            System.out.println("No");
        }

        String aLetter = A.substring(0,1).toUpperCase();
        String bLetter = B.substring(0,1).toUpperCase();
        System.out.println((aLetter + A.substring(1)) + " " + (bLetter + B.substring(1)));

    }
}
