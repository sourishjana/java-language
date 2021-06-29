public class SecondsMinutes {

    // This is a global constant variable
    private static final String INVALID_VAL = "Invalid Value";

    public static String getDurationString(int minutes, int seconds){
        if(minutes<0 || seconds<0 || seconds>59){
            return INVALID_VAL;
        }
        int hrs=minutes/60;
        minutes= minutes%60;
        return (addZero(hrs)+"h "+addZero(minutes)+"m "+addZero(seconds)+"s");
    }
    public static String getDurationString(int seconds){
        if(seconds<0){
            return INVALID_VAL;
        }
        int minutes=seconds/60;
        seconds=seconds%60;
        return getDurationString(minutes, seconds);
    }

    public static String addZero(int time){
        if(time < 10){
            return "0"+time;
        }
        return ""+time;
    }
}
