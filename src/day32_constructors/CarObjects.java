package day32_constructors;

public class CarObjects {
    public static void main(String[] args) {

        Car car1=new Car("mazda");
        System.out.println(car1);

        Car car2=new Car("BMW", "3");
        System.out.println(car2);

        Car car3=new Car("Toyota", "Corolla", 2012);
        System.out.println(car3);

        Car car4=new Car("Mercedes", "E200", 2022, 1000000);
        System.out.println(car4);

        Car car5= new Car("Fiat", "E500", 2000, 35000, "mor");
        System.out.println(car5);

    }
    }
