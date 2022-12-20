package day38_Inheritance.ShapeTask;

public class Square extends Shape{
    public Square(double s) {
        super("kare");
        setS(s);
    }

    private double s;

    public double getS() {
        return s;
    }

    public void setS(double s) {
        if (s<=0){
            System.err.println("invalid side: "+s);
            System.exit(1);
        }
        this.s = s;
    }

    public double area(){
        return s*s;
    }

    public double perimeter(){
        return 4*s;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + s +
                ", name='" + getName() + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}
