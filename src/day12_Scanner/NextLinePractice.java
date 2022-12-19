package day12_Scanner;

import java.util.Scanner;

public class NextLinePractice {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("How old are you?");
        int age=input.nextInt();
        input.nextLine();
        System.out.println("What is your full name");
        String name=input.nextLine();
        System.out.println("your name is "+name+" and you are "+age+" years old.");
        input.close();
    }
}
