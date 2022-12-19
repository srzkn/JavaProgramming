package day08_IfStatements;

public class SingleIfStatementIntro {
    public static void main(String[] args) {
        int  a = 300;
        boolean evenNumber =a%2==0;
        boolean oddNumber =! evenNumber; //not even number

        if (evenNumber)
              {
        System.out.println("Even Number");
             }
        if (oddNumber)
             {
        System.out.println("Odd Number");
             }
        System.out.println("---------------");
        int n=200;
            if (n > 0)    {  System.out.println(n+" is a positive number"); }
            if (n<0)      {  System.out.println(n+" is a negative number");}
            if (n==0)     {  System.out.println(n+" is zero!");}
}
}
