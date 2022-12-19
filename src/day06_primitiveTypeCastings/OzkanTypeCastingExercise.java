package day06_primitiveTypeCastings;

public class OzkanTypeCastingExercise {
    public static void main(String[] args) {
        float a=100.0f;
        double b=a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        double c=50.9;
        byte d=(byte)c;
        System.out.println("c = " + c);
        System.out.println("d = " + d);

        int x=1;
        long y=x;
        float z=y;
        System.out.println();
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);

        int g =987654321;
        byte h=(byte)g;
        short i=(short)h;
        System.out.println("g = " + g);
        System.out.println("h = " + h);
        System.out.println("i = " + i);
        System.out.println(g+" : "+h+" : "+i);

        int j=999;
        byte k=(byte)j;
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        double d1=20.5;
        short s1= (short) d1;
        System.out.println(d1+ "= " + s1);
    }
}
