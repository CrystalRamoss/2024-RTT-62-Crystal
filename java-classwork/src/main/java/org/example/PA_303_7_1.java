package org.example;

import java.util.Arrays;

public class PA_303_7_1 {
    public static void main(String[] args) {
//Task 1: Write a program that creates an array of integers with a length of 3. Assign
//the values 1, 2, and 3 to the indexes. Print out each array element.

        int [] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

            System.out.println(array[i]);
        }

        System.out.println("*******************");
//Task 2: Write a program that returns the middle element in an array. Give the following
//values to the integer array: {13, 5, 7, 68, 2} and produce the following output: 7

        int [] array2 = {13, 5, 7, 68, 2};
        if (array2.length % 2 != 0){
            System.out.println(array2[array2.length / 2]);
        }
        //System.out.println(array2[2]);

        System.out.println("*******************");
//Task 3: Write a program that creates an array of String type and initializes it with the
//strings “red,” “green,” “blue,” and “yellow.” Print out the array length. Make a copy
//using the clone( ) method. Use the Arrays.toString( ) method on the new array to
//verify that the original array was copied.

        String [] colors = {"red", "green", "blue", "yellow"};
        System.out.println("length: " + colors.length);
        String [] colors2 = colors.clone();
        System.out.println(Arrays.toString(colors2));

        System.out.println("*******************");
// Task 4: Write a program that creates an integer array with 5 elements (i.e., numbers).
//The numbers can be any integers. Print out the value at the first index and the last
//index using length - 1 as the index. Now try printing the value at index = length (e.g.,
//myArray[myArray.length] ). Notice the type of exception which is produced. Now try
//to assign a value to the array index 5. You should get the same type of exception.

        int [] numbers = {1, 2, 3, 4, 5};
        System.out.println("First: " + numbers[0] + " Last: " + numbers[numbers.length - 1]);
        //System.out.println(numbers[numbers.length]); //Exception
        System.out.println("*******************");

//Task 5: Write a program where you create an integer array with a length of 5. Loop
//through the array and assign the value of the loop control variable (e.g., i) to the
//corresponding index in the array.

        int [] numbers2 = {5,4,3,2,1};

        for (int i = 0; i < numbers2[numbers2.length -1]; i++){
            System.out.println("index: " + i + " value: " + numbers2[i]);
        }
        System.out.println("******************");

//Task 6: Write a program where you create an integer array of 5 numbers.
//Loop through the array and assign the value of the loop control variable multiplied by 2 to the corresponding index in the array.
        int[] array6 = new int[5];

        for (int i = 0; i < array6[array6.length -1]; i++ ){
            array6[i] = i * 2;
        }
        System.out.println(Arrays.toString(array6));

//Task7:Write a program where you create an array of 5 elements.
// Loop through the array and print the value of each element, except for the middle (index 2) element.
        int[] array7 = {1,2,3,4,5};


        for (int i = 0; i < array7[array7.length -1]; i++) {
            if ( i != 2 ){
                System.out.println(array7[i]);
            }
        }

//Task8:Write a program that creates a String array of 5 elements and swaps the first
// element with the middle element without creating a new array.
        String[] array8 = {"a","b","c","d","e"};
        System.out.println("Orginal array: " + array8);
        String temp = array8[0];
        String mid = array8[2];
        array8[0] = mid;
        array8[2] = temp;
        System.out.println(Arrays.toString(array8));

//Task 9: Write a program to sort the following int array in ascending order: {4, 2, 9, 13, 1,
// 0}. Print the array in ascending order, and print the smallest and the largest
// element of the array.

        int[] array9 = {4, 2, 9, 13, 1, 0};
        Arrays.sort(array9);
        System.out.println("array in in ascending order: " + Arrays.toString(array9));




    }

}
