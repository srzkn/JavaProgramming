package day20_Arrays;

import java.util.Arrays;

public class Alphabet {
    public static void main(String[] args) {
        char [] alphabets=new char[26];
        for (int i = 0, j=90; i < alphabets.length; i++, j--) {
            alphabets[i]=(char)j;
        }
        System.out.println(Arrays.toString(alphabets));







    }
}
