package day16_ForLoopsString;

import java.util.Scanner;

public class DublicatedWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please write a sentence");
        String s = scan.nextLine();
        String s2 = "";
        for (int i =s.length()-1; 0<=i; i--) {
            s2 = s2 + s.charAt(i);
            String s3 = "" + s.charAt(i);
            s = s.replaceAll(s3, "");
            i=s.length()-1;
        }
        s = s2;
        System.out.println(s);
        scan.close();
    }
}
