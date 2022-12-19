package day15_ForLoops;

import java.util.Scanner;

public class replaceAll {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a word");
        String s=scan.next();
        s=s.replace("x", "a");
        s=s.replace('X', 'a');
        System.out.println(s);
        scan.close();
    }
}
