package a.examples;

import java.util.ArrayList;
import java.util.Arrays;

public class T1 {
    public static void main(String[] args) {
          method1();
    }
    public static void method1(){
        int n=-5;
        for (int i = 1; i <5; i++) {
            n*=i;
        }
        System.out.println(n);
    }
}
