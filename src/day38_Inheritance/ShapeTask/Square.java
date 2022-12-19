package day38_Inheritance.ShapeTask;

public class Square extends Shape{
    public Square(String name) {
        super(name);
    }

    public double s=4;

    public double area(){
        return s*s;
    }

    public double perimeter(){
        return 4*s;
    }

    @Override
    public String toString() {
        return "Square{" +
                "s=" + s +
                ", name='" + name + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}
