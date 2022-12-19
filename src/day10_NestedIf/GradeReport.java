package day10_NestedIf;

public class GradeReport {
    public static void main(String[] args) {
        int num = 100;
        String st = ""; //temporary value
        if (num >= 0 && num <= 100) { //if score is valid
            if (num >= 90) { //if score is >=90
                st = "Excellent";
            } else if (num >= 80) { //if score is >=80
                st = "Great";
            } else if (num >= 70) { //if score is >=70
                st = "Good";
            } else if (num >= 60) { //if score is >=60
                st = "Passed";
            } else st = "failed"; //if score is <60
        } else st = "it is not a valid number"; // if score is NOT valid
        System.out.println(st);
    }
}
