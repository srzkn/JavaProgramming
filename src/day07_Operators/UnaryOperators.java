package day07_Operators;

public class UnaryOperators {
    public static void main(String[] args) {
        int num1=25;
        int num2=-25;
        System.out.println(num1<0);
        System.out.println(num2<0);
        int b=100;
        System.out.println(++b); // pre increment: increases the value by 1 RIGHT AWAY
        System.out.println(b++); /** Post increment: FIRST: it (passes) uses the value.
                                                   SECOND:increases the value by 1. */
        System.out.println(b);
        int x=200;
        System.out.println(--x);
        System.out.println("-------------------------------------");
        int c=100;
        System.out.println(c++); /**post increment:FIRST:it passes the current value.
                                                   SECOND:it increases the value by 1. */
        System.out.println(c);
        System.out.println(--c);
        System.out.println("------------------------------");
        int z=45;


    }
}
