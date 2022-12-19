package day38_Inheritance.ShapeTask;

public class Rectangle extends Shape{
    public Rectangle(String name) {
        super(name);
    }
    public double l=3;
    public double w=5;

    public double area(){
        return l*w;
    }

    public double perimeter(){
        return 2*(l+w);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "l=" + l +
                ", w=" + w +
                ", name='" + name + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}
