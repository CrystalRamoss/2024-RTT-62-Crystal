package MethodOverloadingChallenge;

public class convertToCentimeters {
    public static double height(int inch){
        return inch * 2.54;
    }

    public static int convertToCentimeters(int ft, int inch ){
        inch = (ft / inch) + inch;
        return heght(inch);
    }


}
