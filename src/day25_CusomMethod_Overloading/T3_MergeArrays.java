package day25_CusomMethod_Overloading;

import java.util.Arrays;

public class T3_MergeArrays {
    public static void main(String[] args) {
        int[]i1={1,2,3};
        int[]i2={4,5,6};
        int[]i3=merge(i1,i2);
        System.out.println(Arrays.toString(i3));

        double[]d1={1.5,2.5,3.5};
        double[]d2={4.5,5.5,6.5};
        double[]d3=merge(d1,d2);
        System.out.println(Arrays.toString(d3));

        char[]c1={'!','^','%'};
        char[]c2={'&', '/', '?'};
        char[]c3=merge(c1,c2);
        System.out.println(Arrays.toString(c3));

        String[]s1={"a","b", "c"};
        String[]s2={"A","B","C"};
        String[]s3=merge(s1,s2);
        System.out.println(Arrays.toString(s3));
    }
    //merges 2 integer array and returns the new array.
    public static int[]merge(int[]i1,int[]i2) {
        int counter=0;
        int[]i=new int[i1.length+i2.length];
        for (int each : i1) {
            i[counter++]=each;
        }
        for (int each : i2) {
            i[counter++]=each;
        }
        return i;
    }

    //merges 2 double array and returns the new array.
    public static double[]merge(double[]i1,double[]i2) {
        int counter=0;
        double[]i=new double[i1.length+i2.length];
        for (double each : i1) {
            i[counter++]=each;
        }
        for (double each : i2) {
            i[counter++]=each;
        }
        return i;
    }

    //merges 2 char array and returns the new array.
    public static char[]merge(char[]i1,char[]i2) {
        int counter=0;
        char[]i=new char[i1.length+i2.length];
        for (char each : i1) {
            i[counter++]=each;
        }
        for (char each : i2) {
            i[counter++]=each;
        }
        return i;
    }

    //merges 2 String array and returns the new array.
    public static String[]merge(String[]i1,String[]i2) {
        int counter=0;
        String[]i=new String[i1.length+i2.length];
        for (String each : i1) {
            i[counter++]=each;
        }
        for (String each : i2) {
            i[counter++]=each;
        }
        return i;
    }
}
