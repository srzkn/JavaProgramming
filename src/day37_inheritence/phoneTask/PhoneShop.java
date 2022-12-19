package day37_inheritence.phoneTask;

public class PhoneShop {
    public static void main(String[] args) {
        Iphone iphone=new Iphone("Iphone 14 Pro Max", "large", 1450, "white");
        Samsung samsung=new Samsung("S20", "large", 1200, "Black");
        Nokia nokia=new Nokia("t45", "medium", 200, "pink");
        System.out.println("iphone = " + iphone);
        System.out.println("samsung = " + samsung);
        System.out.println("nokia = " + nokia);
        iphone.text(123456789);
        iphone.call(911);
        iphone.faceTime("alikaya@yahoo.com");
        iphone.faceTime(12345);
    }
}
