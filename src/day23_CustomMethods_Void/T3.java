package day23_CustomMethods_Void;

import java.util.Arrays;

public class T3 {
    public static void main(String[] args) {
        String str = "amazon";
        String result = "";
        char[] chars = str.toCharArray();
        System.out.println(Arrays.toString(chars));
        for (int i = chars.length - 1; i >= 0; i--) {
           if (i!=0) result += chars[i] + "-";
            else result += chars[i];
        }
        System.out.println(result);
    }
}
