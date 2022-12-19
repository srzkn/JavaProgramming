package day17_while_DoWhileLoops;

public class quiz3 {
    public static void main(String[] args) {
char grade='A';
boolean passed=grade=='A' || grade=='B'; //true
boolean passed2=grade=='C' || grade=='D';

        if (passed || passed2)
            System.out.println("you passed");
        else System.out.println("failed");
    }
}
