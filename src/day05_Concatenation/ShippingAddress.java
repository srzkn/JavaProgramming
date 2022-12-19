package day05_Concatenation;

import java.sql.SQLOutput;

public class ShippingAddress {
    public static void main(String[] args) {
String name="Ozkan Toker",
        buildingNumber="7/f",
        streetName="Ataturk st",
        city="izmir",
        state="bornova",
        zipCode="35040";
        System.out.println(name+"\n"+buildingNumber+" "+streetName+"\n"+city+", "+state+" "+zipCode);
        String address=name+"\n"+buildingNumber+" "+streetName+"\n"+city+", "+state+" "+zipCode;
        System.out.println();
        System.out.println(address);
    }
}
