package day29_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueElements {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.addAll(Arrays.asList(1,1,2,3,3,4,5,5,6,7,7,8,9,9));
        ArrayList<Integer>unique=new ArrayList<>();
        ArrayList<Integer>nonDuplicates=new ArrayList<>();
        /*for (int i = 0; i < list.size(); i++) {
            if (Collections.frequency(list,list.get(i))==1) unique.add(list.get(i));
            if (!nonDuplicates.contains(list.get(i))) nonDuplicates.add(list.get(i));
        }
        System.out.println("unique = " + unique);
        System.out.println("nonDuplicates = " + nonDuplicates);*/
        list.removeIf(p-> Collections.frequency(list,p)!=1);
        System.out.println(list);
    }
}
