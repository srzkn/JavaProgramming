package day10_NestedIf;

public class DaysInWeek {
    public static void main(String[] args) {
        int day=9;
        String dayName;
        if      (day == 1) { dayName="Monday";}
        else if (day == 2) { dayName="Tuesday";}
        else if (day == 3) { dayName="Wednesday";}
        else if (day == 4) { dayName="Thursday";}
        else if (day == 5) { dayName="Friday";}
        else if (day == 6) { dayName="Saturday";}
        else               { dayName="Sunday";}
        System.out.println(dayName);
        System.out.println("----------------------------------");
        dayName=(day==1)? "Monday" :(day==2)? "Tuesday" :(day==3)? "Wednesday" :(day==4)? "Thursday"
                :(day==5)? "Friday" :(day==6)? "Saturday" : "Sunday";
        System.out.println(dayName);


    }
}
