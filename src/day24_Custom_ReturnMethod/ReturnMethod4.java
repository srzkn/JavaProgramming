package day24_Custom_ReturnMethod;

import java.util.Arrays;

public class ReturnMethod4 {
    public static void main(String[] args) {
        int[]a={1,2,3,4,5};
        int[]b=Reverse(a);
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(a));
    }

    private static int[] Reverse(int[] a) {
        int[]b=new int[a.length];
        for (int i=a.length-1, j=0; i>=0; i--, j++)
        {
            b[j]=a[i];
        }
            return b;
    }
}
