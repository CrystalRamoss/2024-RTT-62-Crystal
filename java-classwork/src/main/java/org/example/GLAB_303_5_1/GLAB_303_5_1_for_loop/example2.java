package org.example.GLAB_303_5_1.GLAB_303_5_1_for_loop;

public class example2 {
    public static void main(String[] args) {
        int sum = 0;
        int n = 1000;
        for (int i = 1; i <= n; ++i) {
            sum += i;
        }
        System.out.println("Sum = " + sum);
    }
}
