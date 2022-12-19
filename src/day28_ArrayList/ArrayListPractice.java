package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(11);
        numbers.add(22);
        numbers.add(33);
        numbers.add(44);
        numbers.add(55);
        System.out.println(numbers);
        for (int i = 0; i < numbers.size(); i++) {
            numbers.set(i, numbers.get(i) * 2);
        }
        System.out.println(numbers);

        System.out.println(numbers);
    ArrayList<String>words=new ArrayList<>();
    words.add("a");
    words.add("b");
    words.add("c");
    words.add("d");
        System.out.println(words);
        words.remove(1);
        System.out.println(words);
    }
}
