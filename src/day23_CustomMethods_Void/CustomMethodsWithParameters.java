package day23_CustomMethods_Void;

public class CustomMethodsWithParameters {
    public static void checkOddorEven(int number){
        if (number==0) System.out.println("Zero is not Even or Odd");
        else if (number%2==0) System.out.println(number+" is an even number");
        else System.out.println(number+" is an odd number");
    }
    public static void ageOfPerson(int birtYear)

    {
        System.out.println("you are "+(2022-birtYear)+" years old.");
    }



    public static void main(String[] args) {
        checkOddorEven(0);
        checkOddorEven(4);
        checkOddorEven(3);
        checkOddorEven(10);
        ageOfPerson(1982);
    }
}
