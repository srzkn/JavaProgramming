package day32_constructors;

public class ContructorCalls {
    public ContructorCalls(){
        System.out.println("Default Constructor");
    }
    public ContructorCalls(int a){
        this();
        System.out.println("Constructor with int argument");
    }
    public ContructorCalls(String str){
        this(10);
        System.out.println("Constructor with String argument");
    }

    public static void main(String[] args) {
        ContructorCalls obj1=new ContructorCalls();
        System.out.println("-----------------------------");
        ContructorCalls obj2=new ContructorCalls(10);
        System.out.println("--------------------------------");
        ContructorCalls obj3=new ContructorCalls("try me");

    }
}
