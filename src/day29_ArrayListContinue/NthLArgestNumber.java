package day29_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NthLArgestNumber {
    public static void main(String[] args) {
        ArrayList<Integer>numbers=new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,7,8,8));
        ArrayList<Integer>maximum=new ArrayList<>();
        while(numbers.size()!=0) {
            int max = Collections.max(numbers);
            maximum.add(max);
            numbers.removeIf(p -> Collections.max(numbers) == p);
        }
        System.out.println(maximum);
        System.out.println(maximum.get(3));
        }
}
