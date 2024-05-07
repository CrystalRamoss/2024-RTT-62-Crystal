package Module303_7;

import java.util.Arrays;

public class Practice_Assignment_Array_303_7_1 {
    public static void main(String[] args) {
        //Task 1: Write a program that creates an array of integers with a length of 3. Assign
        //the values 1, 2, and 3 to the indexes. Print out each array element.

        int [] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        System.out.println("*******************");
//Task 2: Write a program that returns the middle element in an array. Give the following
//values to the integer array: {13, 5, 7, 68, 2} and produce the following output: 7

        int [] array2 = {13, 5, 7, 68, 2};
        System.out.println(array2[2]);

        System.out.println("*******************");
//Task 3: Write a program that creates an array of String type and initializes it with the
//strings “red,” “green,” “blue,” and “yellow.” Print out the array length. Make a copy
//using the clone( ) method. Use the Arrays.toString( ) method on the new array to
//verify that the original array was copied.

        String [] colors = {"red", "green", "blue", "yellow"};
        System.out.println("length" + colors.length);
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
        System.out.println(numbers[4]);
        //System.out.println(numbers[5]);
        //numbers[5] = 6;

        System.out.println("*******************");
        //Task 5: Write a program where you create an integer array with a length of 5. Loop
        //through the array and assign the value of the loop control variable (e.g., i) to the
        //corresponding index in the array.

        int [] numbers2= new int[5];

        for (int number : numbers2) {
            number++;
            numbers2[number] = number; // numbers2[0] = 0, numbers2[1] = 1, numbers2[2] = 2, numbers2[3] = 3, numbers2[4] = 4

            System.out.println(numbers2[number]);
        }



    }

}
