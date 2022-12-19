package day15_ForLoops;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int max=-2147483648;
        for (int i = 0; i <5 ; i++) {
            System.out.println("Please write a number");
            int g=scan.nextInt();
                if (g > max) max = g;
        }
        System.out.println("the biggest number you entered is : "+max);
        scan.close();
    }
}
