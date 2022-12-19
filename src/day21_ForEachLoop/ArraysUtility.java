package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {
        int[]nums={1,2,3,4,5};
        System.out.println(Arrays.toString(nums));
        String[]names={"ali", "veli", "kırk", "Dokuz", "elli"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));
        System.out.println(names[0]);
        System.out.println(names[names.length-1]);
        System.out.println("----------------");
        int []a1={1,3,2};
                int []a2={1,2,3};
                        boolean result=Arrays.equals(a1,a2);
        System.out.println(result);
                        Arrays.sort(a1);
        result=Arrays.equals(a1,a2);
        System.out.println(result);

    }
}
