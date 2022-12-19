package day34_GarbageCollection_AccessModifiers;

import java.util.ArrayList;

public class Circle {
    public double radius;
    public static double pi=3;
    public static String name="Circ";
    public static ArrayList<Integer>numbers=new ArrayList<>();

    public Circle(double radius){
        this.radius=radius;
    }

    static {
        pi=3.14;
        name="Circle";
        numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
    }

}
