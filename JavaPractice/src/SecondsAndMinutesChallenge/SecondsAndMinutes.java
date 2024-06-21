package SecondsAndMinutesChallenge;

import org.w3c.dom.ls.LSOutput;

public class SecondsAndMinutes {

    public static String getDurationString(int seconds){
        if ( seconds >= 0) {
            int minutes = seconds / 60;
            seconds = seconds % 60;
            return getDurationString(seconds, minutes);
        } else {
            return "Invalid Duration";
        }
    }

    public static String getDurationString(int seconds, int minutes){
        if (minutes >= 0 && seconds <= 59) {
            minutes = minutes + (seconds / 60);
            int hours = minutes / 60;
            minutes = minutes % 60;
            seconds = seconds % 60;
            return hours + "h" + minutes + "m" + seconds + "s";
        } else {
            return "Invalid Duration";
        }
    }

}
