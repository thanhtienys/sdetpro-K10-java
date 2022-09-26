package src.lesson_06;

public class LabCalculateTime {

    public static void main(String[] args) {

        String myStr = "4hrs and 35 minutes";

        //Get hour
        String timeStr = myStr.substring(0,myStr.indexOf("and"));
        timeStr = timeStr.replaceAll("[a-z]","");
        int time = Integer.parseInt(timeStr.trim());

        //Get minute
        String minutesStr = myStr.substring(myStr.indexOf("and"));
        minutesStr = minutesStr.replaceAll("[a-z]","");
        int minutes = Integer.parseInt(minutesStr.trim());

        System.out.println("Minutes total is : " + ( (time*60) + minutes));
    }
}
