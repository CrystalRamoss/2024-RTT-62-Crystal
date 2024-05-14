package org.example.inClassExamples;

public class slide_303_6_arrayInsert {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        int[] insert = new int[array.length + 1];

        for (int pos = 0; pos < 2; pos++) {
            insert[pos] = array[pos];
        }

        insert[2] = 9;

        for (int pos = 2; pos < array.length; pos++) {
            insert[pos + 1] = array[pos];
        }

        for ( int value : insert) {
            System.out.println(value);
        }
    }
}
