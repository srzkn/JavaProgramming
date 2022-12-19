package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods1 {
    public static void main(String[] args) {
        ArrayList<Integer>numbers=new ArrayList<>();
        System.out.println(numbers.size());
        numbers.add(444);
        System.out.println(numbers.size());
        System.out.println(numbers);
        numbers.add(33);
        System.out.println(numbers);
        System.out.println(numbers.size());
        ArrayList<String>words=new ArrayList<>(3);
        System.out.println(words);
        System.out.println(words.size());
        words.add("ali");
        System.out.println(words.size());
        System.out.println(words);
        words.remove("ali");
        System.out.println(words);
        words.add(0,"ali");
        System.out.println(words);
        words.add(0,"deli ");
        System.out.println(words);
        words.add(2,"veli");
        System.out.println(words);
        words.add(0,"oooooo");
        System.out.println(words);
        System.out.println(words.size());
        words.add(4,"wwwww");
        System.out.println(words);
        System.out.println(words.get(2));
        for (int i = 0; i < words.size(); i++) {
            System.out.println(i+" "+words.get(i));

        }
        words.set(0,"badılcan");
        System.out.println(words);
        words.set(4,"adanalıyakk");
        System.out.println(words);
        words.set(2,"YOK GARİ");
        System.out.println(words);


    }
}