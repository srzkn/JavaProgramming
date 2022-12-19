package day04_Variables;

public class PrimitivesIntro
{
    public static void main(String[] args)
    {
        // age 40 years old (byte)
        // weight 160 pounds (short)
        // salary 100.000 $ (int)
        // population 8.000.000.000 (long)
        byte Age = 40;
        short Weight = 160;
        int Salary = 100_000;
        long Population = 8_000_000_000L;
        float Tax = 0.4f;
        double PI = 3.14;

        System.out.print("Ozkan is ");
        System.out.print(Age);
        System.out.print(" years old, he is ");
        System.out.print(Weight);
        System.out.print(" pounds and he makes ");
        System.out.print(Salary);
        System.out.println(" $ a year!!!");
        System.out.print("And there are ");
        System.out.print(Population);
        System.out.println(" people are living on this planet!!!");
    }
}
