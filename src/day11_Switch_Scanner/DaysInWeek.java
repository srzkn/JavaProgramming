package day11_Switch_Scanner;

public class DaysInWeek {
    public static void main(String[] args) {
        int number = 5;
        String st = "";
        switch (number) {
            case 1:
                st = "Monday";
                break;
            case 2:
                st = "Tuesday";
                break;
            case 3:
                st = "Wednesday";
                break;
            case 4:
                st = "Thursday";
                break;
            case 5:
                st = "Friday";
                break;
            case 6:
                st = "Saturday";
                break;
            case 7:
                st = "Sunday";
                break;
            default:
                st = "it is not a valid number";
                break;
        }
        System.out.println(st);
    }
}
