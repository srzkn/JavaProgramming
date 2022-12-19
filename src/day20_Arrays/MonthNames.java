package day20_Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class MonthNames {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String []months={"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        System.out.println("please write the month number (1 - 12)");
        int monthNumber=scan.nextInt();
        while (monthNumber<1 || monthNumber>12)
        {
            System.err.println("invalid month number.");
            System.out.println("please write the month number (1 - 12)");
            monthNumber=scan.nextInt();
        }
        System.out.println(months[monthNumber-1]);
        for (int i = 0; i < months.length; i++) {
            System.out.println(months[i]);
        }
        for (int i = months.length-1; i >=0 ; i--) {
            System.out.println(months[i]);
        }
        System.out.println(Arrays.toString(months));
    }
}
