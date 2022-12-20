package day38_Inheritance.ShapeTask;

public class MyShapes {
    public static void main(String[] args) {
        Circle circle=new Circle(5);
        Square square=new Square(4);
        Rectangle rectangle=new Rectangle(3,4);
        System.out.println("rectangle.getName() = " + rectangle.getName());
        circle.setRadius(10);
        System.out.println("circle.area() = " + circle.area());
        System.out.println("circle.perimeter() = " + circle.perimeter());
        System.out.println("circle = " + circle);
        System.out.println("----------------------");
        System.out.println("square.area() = " + square.area());
        System.out.println("square.perimeter() = " + square.perimeter());
        System.out.println("square = " + square);
        System.out.println("------------------------");
        System.out.println("rectangle.area() = " + rectangle.area());
        System.out.println("rectangle.perimeter() = " + rectangle.perimeter());
        System.out.println("rectangle = " + rectangle);


    }
}
