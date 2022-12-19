package day19_LoopPractices;

import java.util.Scanner;

public class UniqueChars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("write a word");
        String word = scan.next();
        String check = "";
        for (int i = 0; i < word.length(); i++) {
            int freq = 0;
            char c = word.charAt(i);
            for (int j = 0; j < word.length(); j++) {
                if (c == word.charAt(j)) {
                    freq++;
                }
            }
            if (freq == 1) {
                check += c;
            }
        }
        System.out.println(check);
    }
}
