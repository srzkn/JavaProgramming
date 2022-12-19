package day17_while_DoWhileLoops;

import java.util.Scanner;

public class login3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("USERNAME:");
        String u = scan.next();
        System.out.println("PASSWORD");
        String p = scan.next();

        if (u.equals("Cydeo") && p.equals("Cydeo123"))
            System.out.println("Logged in");
        else {
            int attempts = 3;
            for (int i = 1; i <=3; i++) {
                System.err.println("incorrect username or password. u have " + attempts + " attemps more. Please re-enter.");
                System.out.println("USERNAME:");
                u = scan.next();
                System.out.println("PASSWORD");
                p = scan.next();
                attempts--;
                if (u.equals("Cydeo") && p.equals("Cydeo123")) {
                    System.out.println("Logged in");
                    break;
                }
                if (i == 3) System.err.println("YOUR account is LOCKED");
            }
        }
    }
}
