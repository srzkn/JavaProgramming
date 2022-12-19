package day24_Custom_ReturnMethod;

import java.util.Arrays;

public class ReturnMethod5 {
    public static void main(String[] args) {
        int []arr1={1,2,3};
        int []arr2={4,5};
        int []arr3=merge2Arrays(arr1,arr2);
        System.out.println(Arrays.toString(arr3));

    }

    private static int[] merge2Arrays(int[] arr1, int[] arr2) {
    int[]arr3=new int[arr1.length+arr2.length];
    int counter=0;
    for (int i=0; i<arr1.length; i++)
    {
        arr3[counter++]=arr1[i];
    }
        for (int i=0; i<arr2.length; i++)
        {
            arr3[counter++]=arr2[i];
        }
    return arr3;
    }
}
