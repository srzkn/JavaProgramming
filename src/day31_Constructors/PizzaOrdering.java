package day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class PizzaOrdering {
    public static void main(String[] args) {

        ArrayList<Pizza>pizzas=new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            Pizza smallPizza = new Pizza('S', 2, 3);
            Pizza mediumPizza=new Pizza('M', 3,4);
            Pizza largePizza=new Pizza('L', 4,5);
            pizzas.addAll(Arrays.asList(smallPizza,mediumPizza,largePizza));
        }
        System.out.println("Total number of pizzas: "+pizzas.size());
        int totalPrice=0;
        for (Pizza pizza : pizzas) {
         totalPrice+= pizza.calCost();
        }
        System.out.println("totalPrice = " + totalPrice);

    }
}
