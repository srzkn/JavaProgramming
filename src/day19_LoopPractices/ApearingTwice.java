package day19_LoopPractices;

import java.util.Scanner;

public class ApearingTwice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("write a word");
        String word = scan.next();
        String data = "";
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            int a = 0;
            for (int j = 0; j < word.length(); j++) {
                if (c == word.charAt(j)) {
                    a++;
                }
            }
            if (a == 2) {
                if (!data.contains("" + c))
                    data += c;
            }
        }
        System.out.println(data);
    }
}
