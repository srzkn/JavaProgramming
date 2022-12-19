package day10_NestedIf;

public class NestedIfIntro {
    public static void main(String[] args) {
        int score = 400;
        if (score >= 0 && score <= 100) {
            if (score >= 60) {
                System.out.println("passed");
            } else {
                System.out.println("failed");
            }
        } else {
            System.out.println("it is not a valid score");
        }
        System.out.println("-------------------------------");
        int age = 25;
        boolean hasId = true;
        if (hasId) {
            if (age >= 21) {
                System.out.println("Eligible to buy alcohol");
            } else System.out.println("Not eligible to buy alcohol");
        } else System.out.println("You must have an ID to buy alcohol");

        System.out.println("-------------------------------");
        int day = 9;
        if (day > 0 && day < 8) {
            if (day == 1) {
                System.out.println("monday");
            } else if (day == 2) {
                System.out.println("tuesday");
            } else if (day == 3) {
                System.out.println("wednesday");
            } else if (day == 4) {
                System.out.println("thursday");
            } else if (day == 5) {
                System.out.println("friday");
            } else if (day == 6) {
                System.out.println("Saturday");
            } else System.out.println("Sunday");
        } else System.out.println("it is not a valid number");
    }
}
