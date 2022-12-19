package day13_StringClass;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("What is your first name?");
        String firstName=scan.nextLine();
        System.out.println("What is your last name?");
        String lastName=scan.nextLine();

        System.out.println(firstName.charAt(0)+"."+lastName.charAt(0));
        scan.close();
    }

}
