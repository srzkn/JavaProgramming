package day15_ForLoops;

import java.util.Scanner;

public class ReverseTheString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please write a sentence");
        String sentence = scan.nextLine();
        String s2 = "";
        for (int i = sentence.length() - 1; i >= 0; i--) {
            s2 = s2 + sentence.charAt(i);
        }
        sentence = s2;
        System.out.println(sentence);
        scan.close();
    }
}
