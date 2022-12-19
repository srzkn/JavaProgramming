package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class removeDuplicates {
    public static void main(String[] args) {
        int[]dupp={1,2,3,3,4,5,6,6,6,7,7,8,8,9};
        dupp= ArraysUtility.removeDuplicates(dupp);
        System.out.println(Arrays.toString(dupp));
        System.out.println("-------------------");
    }
}
