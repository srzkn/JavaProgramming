package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveElements {
    public static void main(String[] args) {
        int[]a={1,2,3,4,5,7,8,9};
        int[]b=removeElement(a,2);
        System.out.println(Arrays.toString(b));
        System.out.println("-----------------");

        double[]a1={1.45,2.45,3.45,4.45,5.45,7.45,8.45,9.45};
        double[]b1=removeElement(a1,2);
        System.out.println(Arrays.toString(b1));
        System.out.println("-----------------");

        char[]a11={'a','b','c'};
        char[]b11=removeElement(a11,2);
        System.out.println(Arrays.toString(b11));
        System.out.println("-----------------");

        String[]a111={"a","b","c","d"};
        String[]b111=removeElement(a111,2);
        System.out.println(Arrays.toString(b111));
        System.out.println("-----------------");

        int[]a3={2,4,6};
        int[]b3={1,2,3};
        int[]c3= ArraysUtility.merge(a3,b3);
        System.out.println(Arrays.toString(c3));
    }
    //removes the element of a given integer array and returns the new array.
    public static int[] removeElement(int[]array,int element){
        int[]removed=new int[array.length-1];
        int counter=0;
        for (int i = 0; i < array.length; i++) {
            if (i!=element) removed[counter++]=array[i];
        }
        return removed;
    }

    //removes the element of a given double array and returns the new array.
    public static double[] removeElement(double[]array,int element){
        double[]removed=new double[array.length-1];
        int counter=0;
        for (int i = 0; i < array.length; i++) {
            if (i!=element) removed[counter++]=array[i];
        }
        return removed;
    }

    //removes the element of a given char array and returns the new array.
    public static char[] removeElement(char[]array,int element){
        char[]removed=new char[array.length-1];
        int counter=0;
        for (int i = 0; i < array.length; i++) {
            if (i!=element) removed[counter++]=array[i];
        }
        return removed;
    }

    //removes the element of a given String array and returns the new array.
    public static String[] removeElement(String[]array,int element){
        String[]removed=new String[array.length-1];
        int counter=0;
        for (int i = 0; i < array.length; i++) {
            if (i!=element) removed[counter++]=array[i];
        }
        return removed;
    }
}
