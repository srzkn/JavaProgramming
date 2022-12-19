package day17_while_DoWhileLoops;

import java.util.Scanner;

public class EligibleToVote {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter age");
        int age = scan.nextInt();
        while (age < 1 || age > 120) {
            System.err.println("invalid entry. Please re-enter your AGE");
            age = scan.nextInt();
        }
        if (age >= 18) System.out.println("You are Eligible");
        else System.out.println("you are UNDER 18. you can NOT vote...");
        System.out.println("Are you a US citizen? yes/no");
        String citizen=scan.next().toLowerCase();
        while (!(citizen.equals("yes") || citizen.equals("no")))
        {
            System.err.println("invalid entry. Are u a US citizen? yes/no");
            citizen=scan.next();
        }
        if (citizen.equalsIgnoreCase("yes"))
            System.out.println("You CAN vote");
        else System.out.println("sorry. you CAN NOT vote.");
        scan.close();
    }
}
