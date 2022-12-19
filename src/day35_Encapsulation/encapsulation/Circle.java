package day35_Encapsulation.encapsulation;

public class Circle {
    private double radius;
    public static double pi=3.14;


public double getRadius(){
    return radius;
}

public void setRadius(double radius){
    if (radius>0) this.radius=radius;
    else return;
}

public double calcArea(){
return radius*radius*pi;
}

public double calcPerimeter(){
    return 2*pi*radius;
}

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                " area=" + calcArea() +
                " perimeter=" + calcPerimeter() +
                '}';
    }

    public Circle(double radius) {
        this.radius= radius;
    }
}
