package day08_IfStatements;

public class SwapTwoVariables_WithoutTemporaryVariable {
    public static void main(String[] args) {

        int a=10;
        int b=15;
        b=b-5; //b=10 now
        a=a+5; //a=15 now
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
