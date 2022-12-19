package day04_Variables;
public class Circle {
    public static void main(String[] args) {
        /** Create a class named Circle, write a program that can
            calculate the area & perimeter of any given Circle */
        double radius = 10;
        double PI = 3.14;
        double area = PI*(radius*radius);
        double perimeter = 2*PI*radius;
        System.out.println("\t\t\tarea of our Circle is      : " + area);
        System.out.println("\t\t\tperimeter of our Circle is : " + perimeter);
    }
}
