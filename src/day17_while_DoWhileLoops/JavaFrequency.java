package day17_while_DoWhileLoops;

import java.util.Scanner;

public class JavaFrequency {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("write a sentence");
String s=scan.nextLine();
int total=0;
        for (int i = 0; i <= s.length()-4; i++) {
            if (s.substring(i,i+4).equals("java"))
            total+=1;
        }
        System.out.println(total);
    }
}
