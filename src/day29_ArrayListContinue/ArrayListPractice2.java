package day29_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListPractice2 {
    public static void main(String[] args) {
        ArrayList<String>names=new ArrayList<>();
        names.addAll(Arrays.asList("ali", "david", "ahmet", "jimmy", "daniel","aaron", "ahmet", "david", "shay"));
        System.out.println(names);
        names.retainAll(Arrays.asList("ahmet","david"));
        System.out.println(names);
        System.out.println("------------------------------------------------------------------");
        String[]nam={"man","men", "meh", "mus","sum","has", "ber"};
        System.out.println(Arrays.toString(nam));
        ArrayList<String>nam2=new ArrayList<String>(Arrays.asList(nam));
        System.out.println(nam2);
        nam2.removeIf(p-> p.startsWith("m"));
        System.out.println(nam2);
        nam=nam2.toArray(new String[0]);
        System.out.println(Arrays.toString(nam));
    }
}
