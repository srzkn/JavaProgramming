package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("What is your full name?");
        String fullName=input.nextLine();
        System.out.println("What is your building number");
        String buildingNumber=input.next();
        input.nextLine();
        System.out.println("What is your street name?");
        String streetName=input.nextLine();
        System.out.println("What is your city name?");
        String cityName=input.nextLine();
        System.out.println("What is your state");
        String stateName=input.next();
        System.out.println("What is your zip code?");
        String zipCode= input.next();
        System.out.println(fullName);
        System.out.print(buildingNumber+ " "+streetName+" "+cityName );
        System.out.println(" "+zipCode+" "+stateName);





        input.close();
    }
}
