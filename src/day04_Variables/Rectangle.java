package day04_Variables;

public class Rectangle
{
    public static void main(String[] args) {
        double length = 10;
        double height = 5;
        double area = length*height;
        double perimeter=2*(length+height);
        System.out.println();
        System.out.println("\t\t\theight of the rectangle is    : " + height);
        System.out.println("\t\t\tlength or the rectangle is    : " + length);
        System.out.println("\t\t\tarea of the rectangle is      : " + area);
        System.out.println("\t\t\tperimeter of the rectangle is : " + perimeter);
    }
}
