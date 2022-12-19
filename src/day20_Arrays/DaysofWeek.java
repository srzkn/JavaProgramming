package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DaysofWeek {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String[]days={"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        System.out.println(Arrays.toString(days));
        System.out.println("Please write the day number. 1 / 7 ");
        int number=scan.nextInt();
        while (number<1 || number>7) {
            System.err.println("invalid number");
            System.out.println("Please write the day number. 1 / 7 ");
            number=scan.nextInt();
        }
        System.out.println(days[number-1]);
        }
}
