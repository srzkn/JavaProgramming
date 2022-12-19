package day29_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility {
    public static void main(String[] args) {
        ArrayList<Integer>numbers=new ArrayList<>();
        numbers.addAll(Arrays.asList(34,56,34,877,23,656,989,45,23,34,45,7));
        Collections.sort(numbers);
        System.out.println(numbers);
        System.out.println("---------------------------------");
        ArrayList<Character>chars=new ArrayList<>();
        chars.addAll(Arrays.asList('a', 'b', 'c', 'd', 'e'));
        Collections.reverse(chars);
        System.out.println(chars);
        Collections.swap(chars,0,chars.size()-1);
        System.out.println(chars);
        System.out.println("Collections.max(numbers) = " + Collections.max(numbers));
        System.out.println("Collections.min(numbers) = " + Collections.min(numbers));
        ArrayList<Integer>list2=new ArrayList<>();
        list2.addAll(Arrays.asList(1,1,1,2,2,2,2,2,2,3,4,4,5,67,8,9));
        Collections.replaceAll(list2,2,999);
        System.out.println(list2);
        System.out.println("Collections.frequency(list2,999) = " + Collections.frequency(list2, 999));
        System.out.println("------------------------------------------");
        ArrayList<String>friends=new ArrayList<>();
        friends.addAll(Arrays.asList("ali", "ali","ali", "veli", "deli"));
        System.out.println("Collections.frequency(friends,\"ali\") = " + Collections.frequency(friends, "ali"));
    }
}
