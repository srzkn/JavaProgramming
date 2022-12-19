package day27_wrapperClasses;

import java.util.Arrays;

public class ReplaceElement {
    public static void main(String[] args) {
        int[]a = {1,2,3,4,5};
        a=replace(a, 2, 9);
        System.out.println(Arrays.toString(a));

        int[]a1 = {1,2,3,4,5,1,1,1,1,1,1};
        a1=replaceAll(a1, 1, 1234);
        System.out.println(Arrays.toString(a1));
        System.out.println("---------------------------------");

        double[]b = {123.3,22323.3,332323.3,42323.3,5232323.3};
        b=replace(b, 2, 0.001);
        System.out.println(Arrays.toString(b));

       char[]c = {'a', 'b', 'c', 'd', 'e'};
       c=replace(c, 2, 'X');
        System.out.println(Arrays.toString(c));


        String[]d = {"q", "w", "e", "r", "t"};
d=replace(d, 2, "X");
        System.out.println(Arrays.toString(d));

    }

    //replaces the element of an int array at the given index with given element and returns the new array.
    public static int[] replace(int[]a, int index, int newElement){
        if (index<0 || index>=a.length) {
            System.err.println("invalid index number:"+index);
            System.exit(0);
        }
        a[index]=newElement;
        return a;
    }

    //replaces the element of a double array at the given index with given element and returns the new array.
    public static double[] replace(double[]a, int index, double newElement){
        if (index<0 || index>a.length) {
            System.out.println("invalid index number");
            System.exit(0);
        }
        a[index]=newElement;
        return a;
    }

    //replaces the element of a char array at the given index with given element and returns the new array.
    public static char[] replace(char[]a, int index, char newElement){
        if (index<0 || index>a.length) {
            System.out.println("invalid index number");
            System.exit(0);
        }
        a[index]=newElement;
        return a;
    }

    //replaces the element of a String array at the given index with given element and returns the new array.
    public static String[] replace(String[]a, int index, String newElement){
        if (index<0 || index>a.length) {
            System.out.println("invalid index number");
            System.exit(0);
        }
        a[index]=newElement;
        return a;
    }

    //replaces all matching elements of an int array with the given new element and returns the new array.
    public static int[] replaceAll(int[]a, int oldElement, int newElement){

        int counter=0;
        for (int each : a) {
            if (each==oldElement) a[counter++]=newElement;
            else a[counter++]=each;
        }
        return a;
    }

    //replaces all matching elements of a double array with the given new element and returns the new array.
    public static double[] replaceAll(double[]a, double oldElement, double newElement){

        int counter=0;
        for (double each : a) {
            if (each==oldElement) a[counter++]=newElement;
            else a[counter++]=each;
        }
        return a;
    }

    //replaces all matching elements of a char array with the given new element and returns the new array.
    public static char[] replaceAll(char[]a, char oldElement, char newElement){

        int counter=0;
        for (char each : a) {
            if (each==oldElement) a[counter++]=newElement;
            else a[counter++]=each;
        }
        return a;
    }

    //replaces all matching elements of a String array with the given new element and returns the new array.
    public static String[] replaceAll(String[]a, String oldElement, String newElement){

        int counter=0;
        for (String each : a) {
            if (each.equals(oldElement)) a[counter++]=newElement;
            else a[counter++]=each;
        }
        return a;
    }
}
