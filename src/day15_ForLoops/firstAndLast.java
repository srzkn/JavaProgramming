package day15_ForLoops;

import java.util.Scanner;

public class firstAndLast {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please write your FIRST name");
        String f = scan.next();
        System.out.println("Please write your LAST name");
        String l = scan.next();
        f = f.toLowerCase();
        l = l.toLowerCase();
        String ff = f.substring(0, 1);
        ff = ff.toUpperCase();
        String ll = l.substring(0, 1);
        ll = ll.toUpperCase();
        System.out.println(ff + f.substring(1) + " " + ll + l.substring(1));
    }
}
