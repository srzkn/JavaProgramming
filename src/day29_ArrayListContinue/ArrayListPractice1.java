package day29_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice1 {
    public static void main(String[] args) {
        String[]countries={"germany", "great britain", "turkey", "united states of america", "bozambic"};
        ArrayList<String>countries2=new ArrayList<String>(Arrays.asList(countries));
        System.out.println("countries2 = " + countries2);
        countries2.removeIf(p-> p.length()>=10);
        System.out.println("countries2 = " + countries2);
        countries=countries2.toArray(new String[countries2.size()]);
        System.out.println(Arrays.toString(countries));
    }
}
