package day11_Switch_Scanner;

public class GradeReport {
    public static void main(String[] args) {
        char grade = 'A';
        String value = "";
        switch (grade) {
            case 'A':
                value = "Excellent";
                break;
            case 'B':
                value = "Great Job";
                break;
            case 'C':
                value = "Good";
                break;
            case 'D':
                value = "Passed";
                break;
            case 'F':
                value = "Failed";
                break;
            default:
                value = "Invalid";
        }
        System.out.println(value);
    }
}
