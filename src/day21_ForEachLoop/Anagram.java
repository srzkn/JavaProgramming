package day21_ForEachLoop;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        char[]ch1={'a','c', 'b'};
        char[]ch2={'c','b', 'a'};
        System.out.println(Arrays.equals(ch1,ch2));
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if (Arrays.equals(ch1,ch2)) System.out.println("the are anagram");
        else System.out.println("they are NOT anagram");
    }
}
