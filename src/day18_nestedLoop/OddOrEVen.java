package day18_nestedLoop;

import java.util.Scanner;

public class OddOrEVen {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a number");
            int a = scan.nextInt();
            if (a % 2 == 0) System.out.println(a+" is EVEN");
            else System.out.println(a+" is ODD");

            System.out.println("wanna try again");
            String b = scan.next().toLowerCase();
            while (!(b.equals("yes") || b.equals("no"))) {
                System.out.println("Invalid entry. Please Re-enter");
                b = scan.next().toLowerCase();
            }
            if (b.equals("no")) break;
        }

        scan.close();
    }
}
