package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers will u enter?");
        int numbers = scan.nextInt();
        int[] entries = new int[numbers];
        for (int i = 0; i < numbers; i++) {
            System.out.println("enter the " + (i + 1) + ". number");
            entries[i] = scan.nextInt();
        }
        int min = entries[0];
        int max = entries[0];
        double total = 0;
        for (int i = 0; i < entries.length; i++) {
            if (entries[i] > max) max = entries[i];
            if (entries[i] < min) min = entries[i];
            total += entries[i];
        }
        System.out.println("the numbers you entered are  : "+Arrays.toString(entries));
        System.out.println("the max number is            : " + max);
        System.out.println("the min number is            : " + min);
        System.out.println("the total of the numbers is  : " + total);
        System.out.println("the average of the numbers is: " + (total / numbers));
    }
}
