package day21_ForEachLoop;

import java.util.Arrays;

public class Anagram2 {
    public static void main(String[] args) {
        String str1="acdb";
        String str2="dbca";
        char[]ch1= str1.toCharArray();
        System.out.println(Arrays.toString(ch1));
        char[]ch2=str2.toCharArray();
        System.out.println(Arrays.toString(ch2));
        Arrays.sort(ch1);
        System.out.println(Arrays.toString(ch1));
        Arrays.sort(ch2);
        System.out.println(Arrays.toString(ch2));
        if (Arrays.equals(ch1, ch2)) System.out.println("They are Anagram");
        else System.out.println("they are NOT anagram.");
    }
}
