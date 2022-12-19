package day21_ForEachLoop;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String str="Java";
        char[]chars=str.toCharArray();
        System.out.println(Arrays.toString(chars));
        for (char each:str.toCharArray())
        {
            System.out.println(each);
            String s1="Wooden Spoon";
            String[]words=s1.split(" ");
            String[]words2=s1.split("");
            System.out.println(Arrays.toString(words));
            System.out.println(Arrays.toString(words2));

        }
        String address="ali_kaya@yahoo.com";
        String[]parts=address.split("@");
        System.out.println(Arrays.toString(parts));
    }
}
