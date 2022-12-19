package day17_while_DoWhileLoops;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("write the FIRST number");
        int num1 = scan.nextInt();
        System.out.println("write the SECOND number");
        int num2 = scan.nextInt();
        System.out.println("Enter a math operator");
        char operator = scan.next().charAt(0);
        while (!(operator == '-' || operator == '+')) {
            System.err.println("Invalid Operator, please re-enter");
            operator = scan.next().charAt(0);
        }
        if (operator == '+')
            System.out.println(num1 + "+" + num2 + "= " + (num1 + num2));
        else
            System.out.println(num1 + "-" + num2 + "= " + (num1 - num2));
    }
}
