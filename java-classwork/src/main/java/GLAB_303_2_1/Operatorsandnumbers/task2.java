package GLAB_303_2_1.Operatorsandnumbers;

public class task2 {

        public static void main(String[] args){


            int x = 150;
            System.out.println("The binary: " + Integer.toBinaryString(x));
            x = x >> 2;
            // Predicted value after left shift: 300
            // Predicted binary string after left shift: 00001

            int a = 225;
            System.out.println("The binary: " + Integer.toBinaryString(x));
            a = a >> 2;
            // Predicted value after left shift: 300
            // Predicted binary string after left shift: 00001

            int b = 1555;
            System.out.println("The binary: " + Integer.toBinaryString(x));
            b = b >> 2;
            // Predicted value after left shift: 300
            // Predicted binary string after left shift: 00001

            int c = 32456;
            System.out.println("The binary: " + Integer.toBinaryString(x));
            c = c >> 2;
            // Predicted value after left shift: 300
            // Predicted binary string after left shift: 00001

        }
    }


