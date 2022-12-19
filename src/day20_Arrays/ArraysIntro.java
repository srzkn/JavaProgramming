package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysIntro {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String [] names=new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Please write name");
            names[i]=scan.next();
        }
        names[4]="ellibir";
        System.out.println(Arrays.toString(names));

        System.out.println("-------------------");
        int [] numbers=new int[5];
        System.out.println(Arrays.toString(numbers));

    }
}
