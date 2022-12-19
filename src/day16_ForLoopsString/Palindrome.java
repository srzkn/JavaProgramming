package day16_ForLoopsString;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("write a PALINDROME");
        String s=scan.nextLine();
        String reverse="";
        for (int i =s.length()-1; 0<=i ; i--) {
            reverse=reverse+s.charAt(i);
        }
        if (s.equalsIgnoreCase(reverse))
            System.out.println(s+ " is a palindrome!!!!!");
        else
            System.out.println(s+ " is NOT A palindrome!!!!!");
    scan.close();
    }
}
