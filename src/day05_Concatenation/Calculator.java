package day05_Concatenation;

public class Calculator {
    public static void main(String[] args) {
        int firstNumber=100;
        int secondNumber=50;
        int addition=(firstNumber+secondNumber);
        int substraction=(firstNumber-secondNumber);
        int multiplation=(firstNumber*secondNumber);
        System.out.println("addition = " + addition);
        System.out.println(firstNumber+" + "+secondNumber+" = "+addition);
        System.out.println("substraction = " + substraction);
        System.out.println(firstNumber+" - "+secondNumber+" = "+substraction);
        System.out.println("multiplation = " + multiplation);
        System.out.println(firstNumber+" * "+secondNumber+" = "+multiplation);
    }
}
