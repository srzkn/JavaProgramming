package day12_Scanner;

import java.util.Scanner;

public class GradeReport {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("What is your score?");
        int score= input.nextInt();
        String grade="w";
        if(score>=0 && score<=100)
        {
            if (score>90) grade="A";
            else if (score>80) grade="B";
            else if (score>70) grade="C";
            else if (score>60) grade="D";
            else grade="F";
        }
        else {
            grade="Invalid";
        }
        System.out.println(grade);
        input.close();
    }
}
