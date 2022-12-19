package day15_ForLoops;

import java.util.Scanner;

public class MinimumNumber {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int min=2147483647;
        for (int i = 0; i <5 ; i++) {
            System.out.println("Please write a number");
            int entry=scan.nextInt();
            if (entry<min) min=entry;
        }
        System.out.println("the minimum number you entered is: "+min);
        scan.close();
    }
}
