package day40_finalKeyword;

public class finalVariable {
    final String name;
    static char gender;

    static {
        gender='M';
    }
    public finalVariable(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        final double pi=4.14;

        System.out.println("pi = " + pi);

        finalVariable obj= new finalVariable("ali");
        System.out.println(obj.name);
        obj.gender='F';
        System.out.println(obj.gender);
    }


}
