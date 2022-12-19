package day17_while_DoWhileLoops;

import java.util.Scanner;

public class CatCount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please write the sentence");
        String sentence = scan.nextLine().toLowerCase();
        int count = 0;
        while (sentence.contains("cat")) {
            count ++;
            sentence = sentence.replaceFirst("cat", "");
        }
        System.out.println(count + " cats");
    }
}
