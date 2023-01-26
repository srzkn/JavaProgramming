package day45_interface.shape;

public class Pentagon extends Shape{
    @Override
    public double area() {
        return 0;
    }

    @Override
    public double perimeter() {
        return 0;
    }

    public Pentagon(String name) {
        super(name);
    }
}
