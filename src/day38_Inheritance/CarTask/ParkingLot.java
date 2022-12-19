package day38_Inheritance.CarTask;

public class ParkingLot {
    public static void main(String[] args) {
        Toyota toyota=new Toyota("Camry", 2022,34000, "gray", 123445);
        System.out.println(toyota);

        Tesla tesla=new Tesla("Model S", 2020, 56000, "red", 12000);
        tesla.autoPilot();
    }
}
