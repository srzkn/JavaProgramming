package day27_wrapperClasses;

import java.util.Arrays;
import java.util.Scanner;

public class WrapperClassMethods {
    public static void main(String[] args) {
        String str = "123456";
        int i = Integer.parseInt(str);
        System.out.println(i + 1);
        System.out.println(str + 1);

        String s2 = "15.5";
        double d = Double.parseDouble(s2);
        System.out.println(d + 100);
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        System.out.println(max);
        System.out.println(min);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);

        String s3="tru";
        boolean b=Boolean.parseBoolean(s3);
        System.out.println(b);

        String w="123";
        int f=Integer.valueOf(w);
        System.out.println(f*2);
        System.out.println("-----------------------------------------------------------");
        //isDigit()
        char ch1='d';

        boolean bb=Character.isDigit(ch1);
        boolean dc=Character.isLetter(ch1);
        System.out.println(bb);
        System.out.println(dc);

        boolean fd=Character.isUpperCase('R');
        System.out.println(fd);
        System.out.println("----------------------");
        String s5="ab1asd2asd3sdf4";
        int total=0;
        for (int j = 0; j < s5.length(); j++) {
            if (Character.isDigit(s5.charAt(j)))
            {
                total += Integer.valueOf(s5.charAt(j) + "");
            }
        }
        System.out.println(total);
        System.out.println("---------------------------");

    }
}
