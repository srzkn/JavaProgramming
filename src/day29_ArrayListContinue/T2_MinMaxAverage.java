package day29_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;

public class T2_MinMaxAverage {
    public static void main(String[] args) {
        ArrayList<Integer>numbers=new ArrayList<>();
        numbers.addAll(Arrays.asList(1,1,1,2,2,3,4,5,6,6,6,7,8,8,8,8,6,6,6,7,8,9));
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        double average=0;
        for (Integer each : numbers) {
            if (each<min) min=each;
            else if (each>max) max=each;
            average+=each;
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("average = " + average/numbers.size());
    }
}
