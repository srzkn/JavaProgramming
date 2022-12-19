package day17_while_DoWhileLoops;

import java.util.Scanner;

public class BranchingStatements {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.print(i+" ");
            if (i=='E')
                break;
        }
        System.out.println("-----------------------------");
        int num=0;
        do {
            System.out.println("enter a number");
            num=scan.nextInt();
        }while (num>=0);
        System.out.println("-----------------------------");



    }
}
