package day30_customClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObjects {
    public static void main(String[] args) {

        Car car1=new Car();
        car1.setInfo("Mazda", "3", "Grey", 2010, 150000);
        System.out.println(car1);

        Car car2=new Car();
        car2.setInfo("Renault", "Kadjar", "Blue", 2016, 700000);
        System.out.println(car2);

        Car car3=new Car();
        car3.setInfo("Mercedes", "E200", "Black", 2022, 100000);

        System.out.println(car3);

        System.out.println("---------------------------------------------");
        ArrayList<Car>myCars=new ArrayList<>();
        myCars.addAll(Arrays.asList(car1,car2,car3));
        System.out.println(myCars);
car1.drive();
car2.stop();
        System.out.println("---------------------------------------------");
        for (Car myCar : myCars) {
            System.out.println(myCar.brand+" : "+myCar.price);
        }
myCars.removeIf(p->p.brand.equals("Renault")&&p.year>2010&&p.year<=2030);
        System.out.println(myCars);

    }


}
