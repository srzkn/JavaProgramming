package day18_nestedLoop;

import java.util.Scanner;

public class NestedLoopIntro {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        for (int i = 1; i < 11; i++) {
            for (int j = 1; j < 11; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}
