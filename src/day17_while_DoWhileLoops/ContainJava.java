package day17_while_DoWhileLoops;

import java.util.Scanner;

public class ContainJava {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Write a sentence that has lots of JAVA in it.");
        String sentence=scan.nextLine().toLowerCase();
        int counter=0;
        while (sentence.contains("java"))
        {
            counter+=1;
            sentence=sentence.replaceFirst("java","");
        }
        System.out.println("total number: "+counter);
    }
}
