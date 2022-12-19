package day08_IfStatements;

public class LogicalOperators {
    public static void main(String[] args) {
        String name="Steven";
        int age=19;
        String citizen="USA";
        boolean isEligible=age>=18 && citizen=="USA";
        boolean evet=1<2 && 3>1;
        System.out.println(name+" is eligible to vote: "+isEligible);
        System.out.println("evet = " + evet);
        System.out.println(2<1&&2>1); //false VE    true= sonuç false
        System.out.println(2<1||2>1); //false VEYA  true= sonuç true
        System.out.println(!(1<2)); //false çünkü true'nın tersi
        System.out.println("---------------------------------------");

        String name3="Shay";
        int age3=21;
        char gender='F';

        boolean isEligible3= age3>=18 && (gender== 'M' || gender=='F');
                            //  true  && ( false       ||  true      )
                            //  true  && (        true               )
                            //      true
        System.out.println("isEligible3 = " + isEligible3);
        System.out.println("-----------------------------------------");

        String name4="Ali";
        String countryOfBirth = "UK";
        boolean marriedToUSCitizen=false;

        boolean isEligible4=countryOfBirth=="USA" || marriedToUSCitizen==true;
                            //    FALSE           ||      FALSE
                            //          FALSE
        System.out.println("isEligible4 = " + isEligible4);
        System.out.println("-----------------------------------------------");
        String student="Anna";
        double gpa=3.5;
        int familyIncome = 100000;

        boolean isEligible5= gpa>=3.5 || familyIncome<=60000; // true or false ::: true
        System.out.println("isEligible5 = " + isEligible5);
        System.out.println("--------------------------------------------");
        boolean son=true;
        boolean ilk=!son;
        System.out.println("ilk = " + ilk);

    }
}
