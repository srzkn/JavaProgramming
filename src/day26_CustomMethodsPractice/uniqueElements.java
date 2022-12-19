package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class uniqueElements {
    public static void main(String[] args) {
        int[]a={1,2,3,3,4,5,6,6,6,7,7,8,8,9};
        int[]b= ArraysUtility.uniqueElements(a);
        System.out.println(Arrays.toString(b));
        System.out.println("-------------------");

        int[]dupp={1,2,3,3,4,5,6,6,6,7,7,8,8,9};
        int[]dupp2= ArraysUtility.removeDuplicates(dupp);
        System.out.println(Arrays.toString(dupp));
        System.out.println(Arrays.toString(dupp2));
        System.out.println("-------------------");

        double[]a1={1.1,1.1,1.1,2.4,3.3,4.2,4.4,4.4,4.4,4.4,5.5,5.5};
        double[]b1= ArraysUtility.uniqueElements(a1);
        System.out.println(Arrays.toString(b1));
        System.out.println("-------------------");

        char[]a2={'a','a','b','c','d'};
        char[]b2= ArraysUtility.uniqueElements(a2);
        System.out.println(Arrays.toString(b2));
        System.out.println("-------------------");

        String[]a3={"a","a","bee","cee","dee"};
        String[]b3= ArraysUtility.uniqueElements(a3);
        System.out.println(Arrays.toString(b3));
        System.out.println("-------------------");

int[]adana={1,1,1,1,2,22,3,3,44,45,45,56,56,56,6,57,6,767,78,78,9};


    }
}
