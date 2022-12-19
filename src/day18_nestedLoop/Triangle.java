package day18_nestedLoop;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        for (int i = 1; i < 11; i++) {
            int j=1;
            while (j<=i)
            {System.out.print("* ");
            j++;}
            System.out.println();
        }
        }
    }

