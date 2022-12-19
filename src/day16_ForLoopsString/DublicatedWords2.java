package day16_ForLoopsString;

import java.util.Scanner;

public class DublicatedWords2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("write a sentence");
        String sentence = scan.nextLine();
        String newSentence = "";
        for (int i = 0; i < sentence.length(); i++) {
            if (!newSentence.contains("" + sentence.charAt(i)))
                newSentence += sentence.charAt(i);
            else newSentence += "";
        }
        newSentence=newSentence.replace(" ", "");
        System.out.println(newSentence);
    }
}
