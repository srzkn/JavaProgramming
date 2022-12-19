package day15_ForLoops;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
        System.out.println("------------------------------------------");
        Scanner scan = new Scanner(System.in);
        int total = 0;
        for (int i = 1; i < 6; i++) {
            System.out.println("Enter a number");
            int number = scan.nextInt();
            total = total + number;
        }
        System.out.println("the sum of the numbers you entered is: " + total);
    scan.close();
    }
}
