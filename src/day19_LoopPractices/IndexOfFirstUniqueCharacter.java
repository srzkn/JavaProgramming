package day19_LoopPractices;

import java.util.Scanner;

public class IndexOfFirstUniqueCharacter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please write the word");
        String word = scan.next();
        for (int i = 0; i < word.length(); i++) {
            int a = 0;
            char c = word.charAt(i);
            for (int j = 0; j < word.length(); j++) {
                if (c == word.charAt(j)) {
                    a++;
                }
            }
            if (a == 1) {
                System.out.println(word.indexOf(c));
                break;
            }
        }
    }
}
