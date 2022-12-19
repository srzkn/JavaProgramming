package day20_Arrays;

import java.util.Arrays;

public class ZtoA {
    public static void main(String[] args) {
        char []letters=new char[26];
        for (int i =0, j='Z'; i<letters.length; i++, j--)
        {
            letters[i]=(char)j;
        }
        System.out.println(Arrays.toString(letters));
    }
}
