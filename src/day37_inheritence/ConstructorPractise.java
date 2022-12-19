package day37_inheritence;

class A{
    public A(int a){
        System.out.println("A");
    }
}

class B extends A{
    public B(){
        super(4);
        System.out.println("B");
    }
}

public class ConstructorPractise {
    public static void main(String[] args) {
        B obj=new B();
    }
}
