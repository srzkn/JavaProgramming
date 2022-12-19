package day07_Operators;

public class RelationalOperators {
    public static void main(String[] args) {
        // >, >=, <, <=, ==, !=
        System.out.println(1==2);  //false
        System.out.println(1!=1);  //false
        System.out.println(1<1);  //false
        System.out.println(1>1);  //false
        System.out.println(2<=1);  //false
        System.out.println(1>=2);  //false

        boolean result=200>=100;
        System.out.println("result = " + result); //true
        System.out.println("-------------");
        // need credit score for loan is 720
        int creditScore=745;
        boolean isEligibleForLoan= creditScore>=720;
            /** if the creditScore is greater than or equals to 720, then it is eligible for loan. */
        System.out.println("isEligibleForLoan = " + isEligibleForLoan);
        System.out.println("----------");
        int score = 59;  //geçmesi için gereken minimum 60.
        boolean hasFailed=score<=59;
        System.out.println("hasFailed = " + hasFailed);
        String a="Ali";
        String b="Ali";
        Boolean c= a==b;
        System.out.println("c = " + c);
        int f=100;
        int g=100;
        boolean s=f==g;
        System.out.println("s = " + s);
        boolean result3= 'A'=='a'; // sonuç false. çünkü A ve a farklı ASCII kodlara sahip.
        System.out.println("result3 = " + result3);
        boolean result4="Java"=="Java"; // sonuç true.
        System.out.println("result4 = " + result4);
        System.out.println("------------------------");
        boolean result5=100 != 5.5;  //true. çünkü ikisi birbirine eşit değil.
        boolean result8= 2!=2; // false. çünkü ikisi birbirine eşit.
        System.out.println("result5 = " + result5);
        System.out.println("result8 = " + result8);


    }
}
