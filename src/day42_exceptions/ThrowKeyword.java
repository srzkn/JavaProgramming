package day42_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowKeyword {
    public static void main(String[] args) {
        System.out.println("enter your age");
        int age=new Scanner(System.in).nextInt();

        if (age<0){
            throw new InputMismatchException("age can not be negative "+age);
        }
        else if (age>21){
            System.out.println("you're eligible");
        }
        else{
            throw new RuntimeException("you must be at least 21 years old");
        }
    }
}
