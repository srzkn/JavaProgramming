package day25_CusomMethod_Overloading;

import utilities.ArraysUtility;

public class Test2 {
    public static void main(String[] args) {
        int[]arr1={1,2,3,4,5};
        ArraysUtility.printEachElement(arr1);
        System.out.println("---------------------------");

        double[]darr={0.5,56.6,0};
        ArraysUtility.printEachElement(darr);
        System.out.println("---------------------------");

        char[]carr={'^','&'};
        ArraysUtility.printEachElement(carr);
        System.out.println("---------------------------");

        String[]sarr={"deme", "be", "arkadas"};
        ArraysUtility.printEachElement(sarr);
        System.out.println("---------------------------");

        int[]arr2={1,2,3,4,5};
        int maxInteger=ArraysUtility.maxElement(arr2);
        System.out.println(maxInteger);
        System.out.println("---------------------------");

        double[]arr3={143.4,3.4,52.5,37.8,40.9,5.0};
        double maxDouble=ArraysUtility.maxElement(arr3);
        System.out.println(maxDouble);
        System.out.println("---------------------------");

        int minInteger=ArraysUtility.minElement(arr2);
        System.out.println(minInteger);
        System.out.println("---------------------------");

        double minDouble=ArraysUtility.minElement(arr3);
        System.out.println(minDouble);
        System.out.println("---------------------------");

        int[]arr4={123,23,34,45,55}; int element=34;
        boolean res=ArraysUtility.contains(arr4,element);
        System.out.println(res);
        System.out.println("---------------------------");

        double[]arr5={12.33,2.33,3.34,4.35,53.5}; double element2=3.34;
        boolean resu=ArraysUtility.contains(arr5,element2);
        System.out.println(resu);
        System.out.println("---------------------------");

        char[]arr6={'q','e'}; char element3='q';
        boolean resul=ArraysUtility.contains(arr6,element3);
        System.out.println(resu);
        System.out.println("----------------------------");

        String []sss={"aa", "bb"}; String el="ea";
        boolean ress=ArraysUtility.contains(sss,el);
        System.out.println(ress);
    }
}
