package day12_Scanner;
import java.util.Scanner;
public class ScannerPractice {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("What is your name full name");
        String name=input.nextLine();
        System.out.println("How old are you?");
        int age=input.nextInt();
        input.nextLine();
        System.out.println("What is your Programming language");
        String program=input.nextLine();
        System.out.println(name);
        System.out.println(age);
        System.out.println(program);
        input.close();
    }
}


