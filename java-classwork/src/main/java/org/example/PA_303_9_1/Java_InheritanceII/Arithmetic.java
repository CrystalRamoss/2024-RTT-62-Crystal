package org.example.PA_303_9_1.Java_InheritanceII;

public class Arithmetic {

    private int input1;
    private int input2;
    private int sum;

    public Arithmetic(int input1, int input2, int sum){
        this.input1 = input1;
        this.input2 = input2;
        this.sum = sum;
    }

    public int add (int x, int y) {
        sum = x + y;
        return sum;
    }

}


