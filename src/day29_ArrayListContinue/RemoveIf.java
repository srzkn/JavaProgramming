package day29_ArrayListContinue;

import utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIf {
    public static void main(String[] args) {
        ArrayList<Integer>numbers=new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        System.out.println(numbers);
       numbers.removeIf(p-> p<5);
        System.out.println(numbers);
        System.out.println("---------------------------------");
        ArrayList<Integer>list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list.removeIf(p-> p%2==0);
        System.out.println(list);
        System.out.println("-------------------------------------");
        ArrayList<String>namess=new ArrayList<>();
        namess.addAll(Arrays.asList("Java","Python", "JavaScript", "C#", "C++", "Java", "Java"));
        namess.removeIf(name-> name.charAt(0)=='J');
        namess.removeIf(p -> p.startsWith("P"));
        System.out.println(namess);
        System.out.println("-------------------------------------------------");
        ArrayList<String>ad=new ArrayList<>();
        ad.addAll(Arrays.asList("Anna", "Racecar", "Level", "Eye", "Java", "Python", "Cydeo"));
        ad.removeIf(name-> !StringUtility.isPalindrome(name));
        System.out.println(ad);

    }
}
