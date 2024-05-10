package org.example.SBA1_Practice;

public class p1 {

    public static void main(String[] args){
        String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        // part 1 - create a for loop to print each character of the string s on its own line
        // you can use the s.charAt(pos) function



        for (int pos = 0; pos < s.length(); pos++ ) {

            char letter = s.charAt(pos);

            System.out.println(letter);

        }


        // part 2
        // Given the following Strings convert them to integer values   Integer.valueOf()
        String ten = "10";
        String hundred = "100";

        Integer tenInt = Integer.valueOf(ten);
        Integer hundredInt = Integer.valueOf(ten);

        // part 3
        // given an integer array find the sum of all the integers in the array
        int[] array = {2, 4, 5, 6, 7, 8, 10};
        int sum = 0;

        for (int pos = 0; pos < array.length; pos++ ){
            sum += array[pos];
        }
        System.out.println(sum);

        // part 4
        // given the array of string covert them to numbers and print the sum
        String[] nums = {"2", "4", "5", "6", "7", "8", "10"};

        int sum2 = 0;


        for (int pos = 0; pos < nums.length; pos++ ) {


            int number = Integer.valueOf(nums[pos]);
            System.out.println(number);
            sum2 += array[pos];
        }
        System.out.println(sum2);

    }

}
