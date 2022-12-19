package day21_ForEachLoop;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[]numbers={10,20,30,40,50};
        int[]numbers2=new int[numbers.length];
        int count=numbers.length-1;
        for (int number : numbers) {
            numbers2[count]=number;
            count--;
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(numbers2));
    }
}
