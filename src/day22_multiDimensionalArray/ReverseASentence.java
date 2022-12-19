package day22_multiDimensionalArray;

import java.util.Arrays;

public class ReverseASentence {
    public static void main(String[] args) {
        String sentence = "Today is a good day to learn Java";
        String[]words=sentence.split(" ");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i]+" ");
        }
    }
}
