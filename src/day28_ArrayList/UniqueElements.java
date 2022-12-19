package day28_ArrayList;

import java.util.ArrayList;

public class UniqueElements {
    public static void main(String[] args) {
        ArrayList<String>words=new ArrayList<>();
        words.add("Java");
        words.add("Java");
        words.add("Java");
        words.add("Python");
        words.add("C^");
        words.add("C^");
        words.add("C^");
        words.add("Ruby");
        words.add("C++");
        words.add("C++");
        System.out.println(words);
        ArrayList<String>uniqueElements=new ArrayList<>();
        for (int i = 0; i < words.size(); i++) {
            String each= words.get(i);
            if (words.indexOf(each)==words.lastIndexOf(each)) uniqueElements.add(each);
        }
        System.out.println(uniqueElements);
        System.out.println(words);
        System.out.println(words.contains("Java"));
        System.out.println(words.get(0).contains("Java"));
        System.out.println(words.get(0).equals("Java"));
    }
}
