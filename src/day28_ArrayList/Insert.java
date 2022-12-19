package day28_ArrayList;

import java.util.Arrays;

public class Insert {
    public static void main(String[] args) {
        int[]arr1={1,2,3,4,5,6,7,8,9};
        int[]arr2=addElement(arr1,2,999);
        System.out.println(Arrays.toString(arr2));
    }
    public static int[] addElement(int[]arr1, int index, int element){
        int []arr2=new int[arr1.length+1];
        int k=0;
        for (int i = 0; i <arr2.length ; i++) {
            if (i==index) arr2[i]=element;
            else arr2[i]=arr1[k++];
        }
        return arr2;
        }

    }
