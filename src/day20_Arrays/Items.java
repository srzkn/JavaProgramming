package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Scanner;

public class Items {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
String [] items=new String[5];
int []prices=new int[5];
int total=0;
        for (int i = 0; i < 5; i++) {
            scan.nextLine();
            System.out.println("item name?");
            items[i]=scan.nextLine();
            System.out.println("Price of it");
            prices[i]=scan.nextInt();
            total+=prices[i];
        }
        System.out.println("---------------------------");
        System.out.println("item list: "+ Arrays.toString(items));
        System.out.println("item name   price");
        for (int i = 0; i < 5; i++) {
            System.out.println(items[i]+"\t\t\t"+prices[i]);
        }
        System.out.println("total price "+total);
    }
}
