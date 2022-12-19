package day18_nestedLoop;

import java.util.Scanner;

public class AdditionOfTwoNumbers {
    public static void main(String[] args) {
   while (true) {
       Scanner scan = new Scanner(System.in);
       System.out.println("FIRST");
       int i1 = scan.nextInt();
       System.out.println("SECOND");
       int i2 = scan.nextInt();
       System.out.println("Addition: " + (i1 + i2));
       System.out.println("Would you like to continue?");
       String a=scan.next().toLowerCase();
   if (a.equals("no")) break;
  while (!(a.equals("yes") || a.equals("no")))
  {
      System.out.println("Invalid answer. Please re-enter.");
      a=scan.next().toLowerCase();
  }
   }







    }
}
