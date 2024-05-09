package org.example.Module303_7;

import java.util.Arrays;

public class arraysort {
    public static void main(String[] args) {
        int[] array = {6, 0, 3, 5};

        for (int outer = 0; outer < array.length; outer++) {
            for (int pos = 0; pos < array.length - 1; pos++) {
                if (array[outer] < array[pos + 1]) {
                    int temp = array[pos];
                    array[outer] = array[pos + 1];
                    array[pos + 1] = temp;
                }
            }
            System.out.println(Arrays.toString(array));
        }
    }
}