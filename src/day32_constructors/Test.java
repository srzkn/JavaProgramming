package day32_constructors;

public class Test {

    public  Test(){
        System.out.println("A");
    }

    public Test(int a){
        this();
        System.out.println("B");
    }

    public Test(double b){
        this(8);
        System.out.println("C");
    }

    public Test(String str){
        this(4.4);
        System.out.println("D");
    }

    public static void main(String[] args) {
        Test test1=new Test();
        System.out.println("---------------------------------------");
        Test test2=new Test(5);
        System.out.println("-----------------------------------------");
        Test test3=new Test(8.5);
        System.out.println("------------------------------------------");
        Test test4=new Test("adana");
    }
}
