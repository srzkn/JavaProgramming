package day24_Custom_ReturnMethod;

import java.util.Scanner;

public class initials {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Full name?");
        String fullName = scan.nextLine().toUpperCase();
        initials(fullName);
        System.out.println("what is your EMAIL address?");
        String emailAddress = scan.nextLine();
        domain(emailAddress);
        System.out.println("Write the month NUMBER");
        int month=scan.nextInt();
monthName(month);
        System.out.println("Write the day NUMBER");
        int day=scan.nextInt();
        dayName(day);
    }
    public static void initials(String fullName) {
        String[] names = fullName.split(" ");
        System.err.println("Your initials are: ");
        for (String name : names) {
            System.out.print(name.substring(0, 1) + " ");
        }
        System.out.println();
    }
    public static void domain(String emailAddress) {
        int d1 = emailAddress.indexOf("@");
        int d2 = emailAddress.lastIndexOf(".");
        String domain = emailAddress.substring(d1 + 1, d2);
        System.err.println("your domain is: " + domain);
    }
    public static void monthName(int month){
        String[]monthNames={"January","February","March","April","May","June","July",
                "August","September","October","November","December"};
        for (int i = 1; i <13; i++) {
            if (i==month) System.out.println(monthNames[i-1]);
        }
        int k=0;
            if (month==1||month==3||month==5||month==7||month==8||month==10||month==12) k=31;
            else if (month==4||month==6||month==9||month==11) k=30;
            else k=28;
        System.out.println("and it has "+k+" days");
    }
    public static void dayName(int day){
        String[]dayNames={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","sunday"};
        for (int i = 1; i <8; i++) {
            if (i==day) System.out.println(dayNames[i-1]);
        }
    }
}
