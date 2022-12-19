package day11_Switch_Scanner;

public class Grade2 {
    public static void main(String[] args) {
        char ch='C';
        String sr="";

        switch (ch){
            case 'A':
            case 'B':
            case 'C':
            case 'D':
                sr="Passed";
                break;
            case 'F':
                sr="Failed";
                break;
            default:
                sr="Invalid";
        }
        System.out.println(sr);
    }
}
