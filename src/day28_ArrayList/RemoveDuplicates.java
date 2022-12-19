package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<Integer>numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(10);
        numbers.add(10);
        numbers.add(20);
        numbers.add(20);
        numbers.add(20);
        numbers.add(30);
        numbers.add(30);
        numbers.add(30);
        Integer num=10;
        System.out.println(numbers);
        ArrayList<Integer>nonDuplicates=new ArrayList<>();
        for (Integer number : numbers) {
            if (!nonDuplicates.contains(number)) nonDuplicates.add(number);
        }
        System.out.println(nonDuplicates);
        System.out.println(numbers.get(0).equals(10));
        System.out.println(numbers.get(0).equals(num));
        System.out.println(numbers.isEmpty());
        System.out.println(numbers);
        ArrayList<String>words2=new ArrayList<>();
        System.out.println(words2.addAll(Arrays.asList("a", "b", "c", "d")));
        System.out.println("words2 = " + words2);
        System.out.println(words2.containsAll(Arrays.asList("a","f")));
        System.out.println(words2.removeAll(Arrays.asList("a")));
        System.out.println(words2);
        System.out.println(words2.retainAll(Arrays.asList("c")));
        System.out.println(words2);
    }
}
