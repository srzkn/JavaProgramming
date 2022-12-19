package day38_Inheritance.ShapeTask;

public class Shape {

    public String name;

    public double area(){
        return 0;
    }

    public double perimeter(){
        return 0;
    }

    public Shape(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}
