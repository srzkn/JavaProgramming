package day22_multiDimensionalArray;

import java.util.Arrays;

public class EachChar {
    public static void main(String[] args) {
        String str = "amazon";
        char[]chars=str.toCharArray();
        System.out.println(Arrays.toString(chars));
        String result="";
        for (int i = chars.length - 1; i >= 0; i--) {
            result+=chars[i]+"-";
        }
        System.out.println(result);
        System.out.println(result.substring(0,result.length()-1));

        //Output : n-o-z-a-m-a
    }
}
