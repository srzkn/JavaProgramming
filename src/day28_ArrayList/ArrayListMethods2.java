package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods2 {
    public static void main(String[] args) {
        ArrayList<Integer>numbers=new ArrayList<>();
        numbers.add(100);
        numbers.add(200);
        numbers.add(200);
        numbers.add(200);
        numbers.add(300);
        numbers.add(400);
        numbers.add(500);

        System.out.println(numbers);
        Integer num=200;
        System.out.println(numbers.indexOf(num));
        System.out.println(numbers.lastIndexOf(num));
        System.out.println(numbers.indexOf(num)==numbers.lastIndexOf(num));


    }
}
