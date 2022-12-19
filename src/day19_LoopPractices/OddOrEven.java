package day19_LoopPractices;
import java.util.Scanner;
public class OddOrEven {
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
       while (true) {
           System.out.println("Write a number");
           int i = scan.nextInt();
           if (i % 2 == 0) System.out.println("EVEN");
           else System.out.println("ODD");
           System.out.println("wanna do it again? yes / no");
           String answer = scan.next().toLowerCase();
           if (!(answer.equals("yes")|| answer.equals("no"))) {
               System.err.println("invalid entry");
               System.exit(0);
           }
           else if (answer.equals("no"))
               break;
       }
       }
}
