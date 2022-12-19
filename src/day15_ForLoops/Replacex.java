package day15_ForLoops;

import java.util.Scanner;

public class Replacex {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a word");
        String s=scan.next();
        char s1=s.charAt(0);
        if (s1=='x')
        {
            s=s.replaceFirst("x", "a");
        }
        System.out.println(s);
        scan.close();
    }
}
