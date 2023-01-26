package day45_interface.shape;

public class Sphere extends Shape implements Volume{
    @Override
    public double area() {
        return 0;
    }

    @Override
    public double perimeter() {
        return 0;
    }

    public Sphere(String name) {
        super(name);
    }

    @Override
    public double volume() {
        return 0;
    }
}
