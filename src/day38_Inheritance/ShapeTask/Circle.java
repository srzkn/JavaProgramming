package day38_Inheritance.ShapeTask;

public class Circle extends Shape{
    public Circle(String name) {
        super(name);
    }

    public double pi=3.14;
    public double r=5;

    public double area(){
        return pi*r*r;
    }

    public double perimeter(){
        return 2*pi*r;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "pi=" + pi +
                ", r=" + r +
                ", name='" + name + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}
