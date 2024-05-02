package GLAB_303_2_1.Operatorsandnumbers;

public class task1 {
    public static void main(String[] args){


        int x = 2;
        System.out.println("The binary: " + Integer.toBinaryString(x));
        x = x << 1;
        // Predicted value after left shift: 4
        // Predicted binary string after left shift: 10

        int a = 9;
        System.out.println("The binary: " + Integer.toBinaryString(a));
        a = a << 1;
        // Predicted value after left shift: 18
        // Predicted binary string after left shift: 100

        int b = 17;
        System.out.println("The binary: " + Integer.toBinaryString(a));
        b = b << 1;
        // Predicted value after left shift: 34
        // Predicted binary string after left shift: 100

        int c = 88;
        System.out.println("The binary: " + Integer.toBinaryString(a));
        c = c << 1;
        // Predicted value after left shift: 176
        // Predicted binary string after left shift: 100

    }
}
