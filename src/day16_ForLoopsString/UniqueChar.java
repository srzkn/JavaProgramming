package day16_ForLoopsString;

import java.util.Scanner;

public class UniqueChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("write a sentence");
        String s = scan.nextLine();
        String u = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i)))
                u += s.charAt(i);
        }
        System.out.println(u);
        scan.close();
    }
}
