package day21_ForEachLoop;

import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {
        int[] i1 = {1, 2, 3, 4, 5, 6, 7};
        int[] i2 = {8, 9};
        int[] i3 = new int[i1.length + i2.length];
        int count = 0;
        for (int i : i1) {
            i3[count++] = i;
        }
        for (int i : i2) {
            i3[count++] = i;
        }
        System.out.println(Arrays.toString(i1));
        System.out.println(Arrays.toString(i2));
        System.out.println(Arrays.toString(i3));
    }
}
