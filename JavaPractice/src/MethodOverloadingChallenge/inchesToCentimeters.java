package MethodOverloadingChallenge;

public class inchesToCentimeters {

    public static double convertToCentimeters(int inch){
        return inch * 2.54;
    }

    public static double convertToCentimeters(int ft, int inch ){
        inch = (ft * 12) + inch;
        return convertToCentimeters(inch);
    }


}
