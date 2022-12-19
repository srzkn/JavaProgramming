package day30_customClass;

public class Car {
   public String brand;
   public String model;
   public String color;
   public int year;
   public int price;

    public void setInfo(String carBrand, String carModel, String carColor, int carYear, int carPrice){
        brand=carBrand;
        model=carModel;
        color=carColor;
        year=carYear;
        price=carPrice;

    }

    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }

    public void drive(){
        System.out.println(brand+" "+model+" drives smooth");
    }
    public void start(){
        System.out.println(brand+" "+model+" starts good");
    }
    public void stop(){
        System.out.println(brand+" "+model+" stops quick");
    }
}
