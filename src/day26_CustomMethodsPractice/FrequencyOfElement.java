package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

public class FrequencyOfElement {
    public static void main(String[] args) {
        int[]array={1,2,3,4,5,4,3,2,2,3,4,5,5,4,3,2,23,4,5,5,4,3,2,};
        int freq= ArraysUtility.frequency(array,2);
        System.out.println(freq);
        System.out.println("----------------------");

        double[]array2={0.9,9.9,7.7,6.6,55,0.9,0.9};
        int freq2=ArraysUtility.frequency(array2,0.9);
        System.out.println(freq2);
        System.out.println("----------------------");

        char[]arrayc={'1','1','1',',','.','.'};
        int freq3=ArraysUtility.frequency(arrayc,'.');
        System.out.println(freq3);
        System.out.println("----------------------");

        String[]arrays={"A","a","x","c","c","c","c","c","c","c"};
        int freq4=ArraysUtility.frequency(arrays,"c");
        System.out.println(freq4);
        System.out.println("----------------------");
    }
}
