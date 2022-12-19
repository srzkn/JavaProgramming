package day23_CustomMethods_Void;

import java.util.Arrays;

public class T2 {
    public static void main(String[] args) {
        //2- Move All Zeroes To The End
        //Input: arr[] = {2, 3, 0, 0, 5, 0, 8}
        //Output = [2, 3, 5, 8, 0, 0, 0]

        int arr[] = {2, 3, 0, 0, 5, 0, 8};
        int arr2[]=new int[arr.length];
        int counter=0;
        for (int i : arr) {
            if (i!=0) arr2[counter++]=i;
        }
        System.out.println(Arrays.toString(arr2));
    }
}
