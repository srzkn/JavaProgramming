package day29_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {
        ArrayList<Integer>numbers=new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,3,3,3,3,3,3,3,3,4,5,5,5,5,5,5,8,8,8,8,8,8,5,6,7,8,9));
        System.out.println(numbers);
        numbers.retainAll(Arrays.asList(3,5,8));
        System.out.println(numbers);
        System.out.println("numbers.containsAll(Arrays.asList(3,5,8)) = " + numbers.containsAll(Arrays.asList(3, 5, 8)));
        System.out.println("---------------------------------");
        String[]names={"ali","veli","kırkdokuz","elli"};
        System.out.println(Arrays.toString(names));
        ArrayList<String>names2=new ArrayList<>(Arrays.asList(names));
        System.out.println(names2);
        System.out.println("-------------------------------------");
        Integer[]arr={1,2,3,4,5,6,7,8,9,10};
        ArrayList<Integer>arr2=new ArrayList<>(Arrays.asList(arr));
        System.out.println(arr2);


    }
}
