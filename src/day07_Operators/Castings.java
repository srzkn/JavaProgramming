package day07_Operators;

public class Castings {
    public static void main(String[] args) {
        float averageScore=20.5f;
        byte num1=(byte)averageScore; //explicit casting
        System.out.println("num1 = " + num1);
        short num2=(short)averageScore; //explicit casting
        System.out.println("num2 = " + num2);
        int num3=(int)averageScore; //explicit casting
        System.out.println("num3 = " + num3);
        long num4=(long)averageScore; //explicit casting
        System.out.println("num4 = " + num4);
        float num5=averageScore; // there is no casting here.
        System.out.println("num5 = " + num5);// implicit casting
        double num6=averageScore;
        System.out.println("num6 = " + num6);
        System.out.println(averageScore);
    }
}
