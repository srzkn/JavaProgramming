package day38_Inheritance.ShapeTask;

public class MyShapes {
    public static void main(String[] args) {
        Circle circle=new Circle("daire");
        Square square=new Square("kare");
        Rectangle rectangle=new Rectangle("dikdortgen");

        circle.r=4;
        System.out.println("circle.area() = " + circle.area());
        System.out.println("circle.perimeter() = " + circle.perimeter());
        System.out.println("circle = " + circle);
        System.out.println("----------------------");
        square.s=10;
        System.out.println("square.area() = " + square.area());
        System.out.println("square.perimeter() = " + square.perimeter());
        System.out.println("square = " + square);
        System.out.println("------------------------");
        rectangle.l=3;
        rectangle.w=2;
        System.out.println("rectangle.area() = " + rectangle.area());
        System.out.println("rectangle.perimeter() = " + rectangle.perimeter());
        System.out.println("rectangle = " + rectangle);


    }
}
