package day30_customClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class T1_ZerosToEnd {
    public static void main(String[] args) {
        ArrayList<Integer>numbers=new ArrayList<>();
        numbers.addAll(Arrays.asList(1,0,2,0,3,0,4,0));
        System.out.println("numbers = " + numbers);
        int size=numbers.size();
        numbers.removeAll(Arrays.asList(0));
        System.out.println("numbers = " + numbers);
        int newsize= numbers.size();;
        int total=size-newsize;
        System.out.println("total = " + total);
        for (int i = 0; i < total; i++) {
            numbers.add(0);
        }
        System.out.println("numbers = " + numbers);
    }
}
