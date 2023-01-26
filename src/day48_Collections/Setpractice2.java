package day48_Collections;

import java.util.*;

public class Setpractice2 {
    public static void main(String[] args) {
        String [] arr={"wooden spoon", "book", "pen", "book", "wooden spoon", "wooden spoon", "wooden spoon", "wooden spoon", "milk", "eggs", "coke", "paper towels"};
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));

        Set<String>set2=new LinkedHashSet<>();
        set2.addAll(Arrays.asList(arr));
        System.out.println("set2 = " + set2);

        Set<String>set1=new HashSet<>();
        set1.addAll(Arrays.asList(arr));
        System.out.println("set1 = " + set1);
        arr=set1.toArray(new String[0]);
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));

        System.out.println("-----------------------------------------------------");
        ArrayList<Integer>list=new ArrayList<>();
        list.addAll(Arrays.asList(10,2,3,3,4,5,5,6,10,2,3,2,3,4,3,5,6));

        list=new ArrayList<>(new LinkedHashSet<>(list));
        System.out.println("list = " + list);
        System.out.println("-----------------------------------------------------");
        String[]array={"a", "a", "b", "b", "c", "d"};
        System.out.println("Arrays.toString(array) = " + Arrays.toString(array));
        List<String>s=new ArrayList<>(Arrays.asList(array));
        System.out.println("-----------------------------------------------------");
        System.out.println("s = " + s);
        Set<String>s2=new TreeSet<>(Arrays.asList(array));
        System.out.println("s2 = " + s2);
        System.out.println("-----------------------------------------------------");
        String str="aaaabbbbccccdddeeeee";
        String result="";
        for (String each : new LinkedHashSet<>(Arrays.asList(str.split("")))) {
            int count=Collections.frequency(Arrays.asList(str.split("")),each);
        result+=each+count;
        }
        System.out.println("result = " + result);



    }
}
