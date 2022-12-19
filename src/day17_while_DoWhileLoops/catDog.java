package day17_while_DoWhileLoops;

import java.util.Scanner;

public class catDog {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("write the sentence");
        String sentence =scan.nextLine();
        int cat=0;
        int dog=0;
        for (int i = 0; i <= sentence.length()-3; i++) {
            if(sentence.substring(i,i+3).equalsIgnoreCase("cat"))
                cat+=1;
            else if(sentence.substring(i,i+3).equalsIgnoreCase("dog"))
                dog+=1;
        }
        System.out.println("there are "+cat+" cats and "+dog+" dogs");
            }
        }
