package day12_Scanner;
import java.util.Scanner;
public class Circle {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        int radius=scan.nextInt();
        System.out.println("Area of the circle is     : "+(3.14*radius*radius));
        System.out.println("Perimeter of the circle is:"+(2*3.14*radius));
        scan.close();
    }
}
