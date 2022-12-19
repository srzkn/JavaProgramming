package day20_Arrays;

import java.util.Arrays;

public class From100To1 {
    public static void main(String[] args) {
        int[]numbers=new int[100];
int k=100;
        for (int i = 0; i < numbers.length; i++) {
          numbers[i]=k;
          k--;
        }
        System.out.println(Arrays.toString(numbers));
    }
}
