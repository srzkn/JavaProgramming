package day29_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueCharacters {
    public static void main(String[] args) {
        String word="aaabcccdeeef";
        String[]letters=word.split("");
    ArrayList<String>list=new ArrayList<>(Arrays.asList(letters));
        System.out.println("list = " + list);
        list.removeIf(p-> Collections.frequency(list,p)!=1);
        System.out.println(list);
    }
}
