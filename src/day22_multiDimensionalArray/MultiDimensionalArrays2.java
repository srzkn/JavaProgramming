package day22_multiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArrays2 {
    public static void main(String[] args) {
        int d3[][][]={{{1,2,3},{4,5,6},{7,8,9,}},{{10,20,30,},{40,50,60},{70,80,90}}};
        System.out.println(Arrays.deepToString(d3));
        System.out.println(Arrays.deepToString(d3[1]));
        System.out.println(Arrays.toString(d3[1][1]));
        System.out.println(d3[1][1][1]);
        for (int[][] d2 : d3) {
            for (int[] d1 : d2) {
                for (int i : d1) {
                    System.out.print(i+" ");
                }
            }
        }


    }
}
