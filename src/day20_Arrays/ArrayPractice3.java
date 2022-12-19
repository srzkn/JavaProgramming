package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers would you like to enter?");
        int size = scan.nextInt();
        while (size < 1) {
            System.err.println("invalid entry.");
            System.out.println("Enter the SIZE of the array");
            size = scan.nextInt();
        }
        int k = 1;
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("enter the " + k + ". number");
            numbers[i] = scan.nextInt();
            k++;
        }
        System.out.println(Arrays.toString(numbers));
        scan.close();
    }
}
