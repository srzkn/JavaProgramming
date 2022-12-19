package day38_Inheritance.CarTask;

public class BMW extends Car {
    public BMW(String model, int year, double price, String color, int miles) {
        super("BMW", model, year, price, color, miles);
    }

    public void start(){
        System.out.println("Call mechanic to jum start "+brand+" "+model);
    }
    public void breaksDown(){
        System.out.println(brand+" "+model+" breaks down well");
    }

    public void racing(){
        System.out.println(brand+" "+model+" is a racing car.");
    }

}
