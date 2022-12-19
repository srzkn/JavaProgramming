package day19_LoopPractices;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a number");
        int i1=scan.nextInt();
        System.out.println("enter an operator");
        char c=scan.next().charAt(0);
        if (!(c=='+'|| c=='-'))
        {
            System.err.println("invalid operator.");
            System.exit(0);
        }
        System.out.println("enter a number");
        int i2=scan.nextInt();
    }
}
