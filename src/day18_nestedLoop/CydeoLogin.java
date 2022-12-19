package day18_nestedLoop;

import java.util.Scanner;

public class CydeoLogin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("USERNAME");
        String u = scan.next();
        System.out.println("PASSWORD");
        String p = scan.next();
        int i;
        if (u.equals("Cydeo") && p.equals("WoodenSpoon"))
            System.out.println("Logged in.");
        else {
            for (i = 3; i > 0; i--) {
                System.err.println("incorrect username or password." + "\n" + "you have " + i + " attempts more.");
                System.out.println("USERNAME");
                u = scan.next();
                System.out.println("PASSWORD");
                p = scan.next();
                if (u.equals("Cydeo") && p.equals("WoodenSpoon")) {
                    System.out.println("Logged in.");
                    break;
                }
            }
            if (i == 0) System.out.println("Your account is locked.");
        }
    scan.close();
    }
}
