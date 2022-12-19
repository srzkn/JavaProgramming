package day17_while_DoWhileLoops;
import java.util.Scanner;

public class replit {
    public static void main(String[] args) {
        //DO NOT TOUCH FOLLOWING LINE/LINES
        System.out.println("Welcome to the Cydeo car insurance!");

        //WRITE YOUR CODE BELOW
        Scanner scan=new Scanner(System.in);
        double PremiumCost=0.0;
        System.out.println("Enter your full name");
        String fullName=scan.nextLine();
        int p=fullName.indexOf(" ");
        fullName=fullName.substring(0,1).toUpperCase()+fullName.substring(1,p)+" "+fullName.substring(p+1,p+2).toUpperCase()+fullName.substring(p+2);

        System.out.println("Do you have a US driver license?");
        String drivingLicense=scan.next();
        if (drivingLicense.toLowerCase().equals("no"))
        {
            System.out.println("You must have a license to get insurance!");
            System.exit(0);
        }

        System.out.println("Enter your zip code");
        int zipCode=scan.nextInt();
        if (zipCode==20910 || zipCode==20740)
            PremiumCost+=60;
        else if (zipCode==22102 || zipCode==22103)
            PremiumCost+=30;
        else
            PremiumCost+=50;
        System.out.println("Is this vehicle owned, financed, or leased?");
        String ownerShip=scan.next();
        if (ownerShip.equals("owned"))
            PremiumCost+=10;
        if (ownerShip.equals("financed"))
            PremiumCost+=15;
        if (ownerShip.equals("leased"))
        PremiumCost+=20;

        System.out.println("How is this vehicle primarily used?");
        String primarilyUsed=scan.next();
        if (primarilyUsed.equals("business"))
            PremiumCost+=50;
        if (primarilyUsed.equals("pleasure"))
            PremiumCost+=10;
        if (primarilyUsed.equals("commuting"))
        {
            PremiumCost+=20;
            System.out.println("How many days do you commute?");
            int days=scan.nextInt();
            PremiumCost=PremiumCost+(days*5);
        }
        System.out.println("How old are you?");
        int age=scan.nextInt();
        if (age<16)
        {System.out.println("You can't be driving");
            System.exit(0);
        }
        if (age>=16 && age<20)
            PremiumCost=PremiumCost*10;
        if (age>=20 && age<25)
            PremiumCost=PremiumCost*6;
        if (age>=25)
         PremiumCost=PremiumCost*2;
scan.nextLine();
        System.out.println("Have you had any accidents in the last 5 years?");
        String accident=scan.nextLine();
        if (accident.toLowerCase().equals("yes"))
        {
            System.out.println("How many?");
            int accidentNumber=scan.nextInt();
            PremiumCost=PremiumCost+(accidentNumber*10);
        }
scan.nextLine();
        System.out.println("What is the highest level of education you have completed?");
        String education=scan.nextLine();
        if (education.equals("Bachelors") || education.equals("Masters"))
            PremiumCost=PremiumCost-(PremiumCost*0.05);
        if (education.equals("PHD"))
            PremiumCost=PremiumCost- (PremiumCost*0.10);
        if (education.equals("High School"))
            PremiumCost=PremiumCost- (PremiumCost*0.05);

        System.out.println(fullName+", here's your quote!");
        System.out.println("This is your start premium cost: $"+PremiumCost);
        String referenceNumber=fullName.substring(0,2)+age+fullName.substring(fullName.length()-3,fullName.length())+zipCode+education.replaceAll(" ","");
        System.out.println("This is your reference number: "+referenceNumber.toUpperCase());


    }
}