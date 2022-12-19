package day17_while_DoWhileLoops;

import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String answer="";
        do {
            System.out.println("Please write the FIRST number");
            int i1=scan.nextInt();
            System.out.println("Please write the SECOND number");
            int i2=scan.nextInt();
            System.out.println("The TOTAL is: "+(i1+i2));
            System.out.println("want to do it again? yes/no");
            answer=scan.next().toLowerCase();
        } while (answer.equals("yes"));
    }
}
