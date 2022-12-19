package day20_Arrays;

import java.util.Arrays;

public class ArraysPractice2 {
    public static void main(String[] args) {
        char[]letters=new char[26];
        char[]letters2=new char[26];
        for (int i = 0; i < 26; i++) {
            letters[i]=(char)(65+i);
        }
        for (int i = 0, j='A'; i < letters2.length; i++, j++) {
            letters2[i]=(char)j;
        }

        System.out.println(Arrays.toString(letters));
        System.out.println(Arrays.toString(letters2));
    }
}
