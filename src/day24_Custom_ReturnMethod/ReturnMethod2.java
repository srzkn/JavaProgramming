package day24_Custom_ReturnMethod;

import java.util.Scanner;

public class ReturnMethod2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Score?");
        int score=scan.nextInt();
        grade(score);
        System.out.println(grade(score));
        if (grade(score).equals("A")) System.out.println("Excellent");
        else if (grade(score).equals("B")) System.out.println("Great");
        else if (grade(score).equals("C")) System.out.println("Good");
        else if (grade(score).equals("D")) System.out.println("Passed");
        else System.out.println("Failed");
    }
    public static String grade(int score) {
        String grade = "";
        if (score > 100 || score < 0) grade = "invalid";
        else {
            grade = (score > 89) ? "A" : (score > 79) ? "B" : (score > 69) ? "C" : (score > 59) ? "D" : "F";
         }
        return grade;
    }
}