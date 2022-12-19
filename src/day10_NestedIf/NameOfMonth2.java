package day10_NestedIf;

public class NameOfMonth2 {
    public static void main(String[] args) {
        int number = 5;
        String name = "";
        name = (number == 1) ? "Jan" : (number == 2) ? "Feb" : (number == 3) ? "Mar" : (number == 4) ? "April"
                : (number == 5) ? "May" : (number == 6) ? "Jun" : (number == 7) ? "Jul" : (number == 8) ? "Aug"
                : (number == 9) ? "Sep" : (number == 10) ? "Oct" : (number == 11) ? "Nov" : "Dec";
        System.out.println(name);
    }
}
