package day11_Switch_Scanner;

public class NumberOfDays {
    public static void main(String[] args) {
        int year=2001;
        int num = 1;
        String sr = "";
        switch (num) {
            case 1:     case 3:     case 5:     case 7:     case 8:     case 10:    case 12:
                sr = "31 Days";
                break;
            case 2:
                sr= (year %4==0)? "29 Days" : "28 Days";
                break;
            case 4:     case 6:     case 9:
            case 11:
                sr = "30 Days";
                break;
            default:
                sr = "Invalid number";
        }
        System.out.println(sr);
    }
}
