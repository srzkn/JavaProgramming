package day18_nestedLoop;

import java.util.Scanner;

public class NestedLoopPractice {
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);

        while (true) {
            System.out.println("AGE");
            int age=scan.nextInt();

            while (!(age >= 0 || age <= 120)) {
                System.out.println("invalid entry. Please Re-enter");
                age = scan.nextInt();
            }
            System.out.println("CONTINUE?");
            String a=scan.next().toLowerCase();
            while (!(a.equals("yes")||a.equals("no")))
            {
                System.out.println("invalid entry. Please Re-enter. CONTINUE?");
                a=scan.next().toLowerCase();

            }
            if (a.equals("no"))
                break;
        }
      scan.close();
        }
}
