package day38_Inheritance.ShapeTask;

public class Rectangle extends Shape{

    private double length, width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length<=0){
            System.err.println("invalid length: "+length);
            System.exit(1);
        }
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width<=0){
            System.err.println("invalid width"+width);
            System.exit(1);
        }
        this.width = width;
    }

    @Override
    public double area() {
        return width*length;
    }

    @Override
    public double perimeter() {
        return 2*(width+length);
    }

    public Rectangle(double length, double width) {
        super("dikdortgen");
        setLength(length);
        setWidth(width);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}
