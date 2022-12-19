package day16_ForLoopsString;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("write a sentence");
        String sen=scan.nextLine();
        String reverse="";
        for (int i =sen.length()-1;  i>=0; i--)
        {
            reverse=reverse+sen.charAt(i);
        }
        System.out.println(reverse);
        scan.close();
    }
}
