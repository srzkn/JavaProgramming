package day21_ForEachLoop;

import java.util.Arrays;

public class MergeTwoCharArrays {
    public static void main(String[] args) {
        char[]ch1={'a','b','c'};
        char[]ch2={'d','e'};
        char[]ch3=new char[ch1.length+ch2.length];
        int i=0;
        for (char c : ch1) {
            ch3[i++]=c;
        }
        for (char c : ch2) {
            ch3[i++]=c;
        }
        System.out.println(Arrays.toString(ch3));
    }
}
