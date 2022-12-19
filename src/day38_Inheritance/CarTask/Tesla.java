package day38_Inheritance.CarTask;

public class Tesla extends Car{
    public Tesla(String model, int year, double price, String color, int miles) {
        super("Tesla", model, year, price, color, miles);
    }

    @Override
    void start() {
        System.out.println("Say \"start\" to start "+brand+" "+model);
    }

    public void autoPilot(){
        System.out.println("Tesla "+model+" has auto pilot.");
    }
}
