package day13_StringClass;
import java.util.Scanner;
public class MyInfo {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your age");
        int age=scan.nextInt();
     System.out.println("Enter your gender");
     String gender= scan.next();
     scan.nextLine();
        System.out.println("Enter your full name");
        String fullName= scan.nextLine();
        System.out.println("Enter your phone number");
        long phoneNumber= scan.nextLong();
        System.out.println("Enter your zip code");
        int zipCode= scan.nextInt();
        scan.nextLine();
        System.out.println("Enter your School name");
        String schoolName= scan.nextLine();
        System.out.println("Enter your city name");
        String cityName=scan.nextLine();
        System.out.println("Enter your state name");
        String stateName= scan.next();
        System.out.println("Enter your building name");
        int buildingNumber= scan.nextInt();
        scan.nextLine();
        System.out.println("Enter your street name");
        String streetName=scan.nextLine();
        System.out.println("1. full name   :"+fullName);
        System.out.println("2. age         :"+age);
        System.out.println("3. gender      :"+gender);
        System.out.println("4. phone number:"+phoneNumber);
        System.out.println("5. address     :"+"\n\t\t\t\t"+buildingNumber+" "+streetName);
        System.out.println("\t\t\t\t"+cityName+", "+stateName+" "+zipCode);
        System.out.println("6. school name :"+schoolName);
        scan.close();
    }
}
