package day45_interface.shape;

public class Rectangle extends Shape{
    @Override
    public double area() {
        return 0;
    }

    @Override
    public double perimeter() {
        return 0;
    }

    public Rectangle(String name) {
        super(name);
    }
}
