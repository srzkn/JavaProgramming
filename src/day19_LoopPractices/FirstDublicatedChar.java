package day19_LoopPractices;

import java.util.Scanner;

public class FirstDublicatedChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("write a word");
        String word = scan.next();
        String data = "";
        int num = 0;
        for (int i = 0; i < word.length(); i++) {
            if (!data.contains("" + word.charAt(i))) {
                data += word.charAt(i);
                for (int j = 0; j < word.length(); j++) {
                    if (data.charAt(data.length() - 1) == word.charAt(j)) {
                        num++;
                    }
                }
                if (num > 1)
                    break;
                num = 0;
            }
        }
        System.out.println(data.charAt(data.length() - 1));
    }
}
