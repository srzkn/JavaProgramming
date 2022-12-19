package day29_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;

public class T1_FirstUniqueElement {
    public static void main(String[] args) {
        ArrayList<Integer>numbers=new ArrayList<>();
        numbers.addAll(Arrays.asList(1,1,1,2,2,3,4,5,6,6,6,7,8,8,8,8,6,6,6,7,8,9));
        System.out.println("numbers = " + numbers);
        Integer unique;
        int counter=0;
        for (int i = 0; i < numbers.size(); i++) {
           counter=0;
            unique=numbers.get(i);
            for (int i1 = 0; i1 < numbers.size(); i1++) {
                if (i1==i) continue;
                else if (unique==numbers.get(i1)) counter++;
            }
            if (counter==0){
                System.out.println(unique);
                break;
            }
        }
    }
}
