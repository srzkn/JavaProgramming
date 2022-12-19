package day20_Arrays;

import java.util.Arrays;

public class UniqueElements {
    public static void main(String[] args) {

        String []words={"Java", "Java", "C#", "Python", "Python"};
        String unique="";
        for (int i = 0; i < words.length; i++) {
            String a=words[i];
            int k=0;
            for (int i1 = 0; i1 < words.length; i1++) {
                if (a.equals(words[i1]))
                    k++;
            }
            if (k==1)
unique+=(words[i]+" ");
        }
        System.out.println("All of the numbers in the array are: "+Arrays.toString(words));
        System.out.println("The unique words in the array are  : "+unique);
    }
}
