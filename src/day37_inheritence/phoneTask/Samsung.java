package day37_inheritence.phoneTask;

public class Samsung extends Phone{
    public Samsung(String model, String size, double price, String color) {
        super("Samsung", model, size, price, color);
    }

    public void freeze(){
        System.out.println("Samsung "+model+" freezes a lot");
    }

}
