package org.example.Module303_7;

//1) Create an int array of length 10
//
//2) Initialize the array to random integers
//
//3) I want you to get the smallest integer in the array
//
//4) I want you to get the largest integer in the array
//
//5) I want you to calculate the average value in the array as a double.  Average is the sum of all elements in the array divided by the length of the array
//
//You can only use a single for loop

public class HomeworkArrays {
    public static void main(String[] args) {
        int[] arrayList = new int[10];
        for (int i = 0; i < arrayList.length; i++) {

            arrayList[i] = (int) (Math.random() * 100);
            System.out.println(arrayList[i]);

//            int smallest = arrayList[0];
//            int largest = arrayList[0];
//            int sum =0;
//
//            for (int number: arrayList){
//                if (number < smallest){
//                    smallest = number;
//                }
//                if (number > largest){
//                    largest = number;
//                }
//                sum += number;
//            }
//            double average = (double)sum / arrayList.length;
//            System.out.println(average);
        }
    }
}
