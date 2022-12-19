package day29_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseArrays {
    public static void main(String[] args) {
        int[]numbers={1,2,3,4,5,6,7,8,9};
        int[]num2=new int[numbers.length];
        for (int i = numbers.length - 1, k=0; i >= 0; i--, k++) {
            num2[k]=numbers[i];
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(num2));
        System.out.println("------------------------------");
        ArrayList<Integer>no=new ArrayList<>();
        no.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        ArrayList<Integer>no2=new ArrayList<>();
        for (int i = no.size() - 1; i >= 0; i--) {
            no2.add(no.get(i));
        }
        System.out.println(no);
        System.out.println(no2);
    }
}
