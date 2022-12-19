package day07_Operators;

public class ShortHandOperators {
    public static void main(String[] args) {
        //assignment operator: =
        int number=100; //we ASSIGN a value to number.
        number=200; // we update the number - we REASSIGN the the number.
        System.out.println(number);
        String word="Java Programming";
        System.out.println("word = " + word); //Java Programming
        word="Wooden Spoon";
        System.out.println("word = " + word); //Wooden Spoon
        word="Cydeo";
        System.out.println("word = " + word); //Cydeo
        System.out.println("-------------------------------");
        int x=100;
        System.out.println("x = " + x);
        x+=200;
        System.out.println("x = " + x);
        String str="Wooden";
                str+=" Spoon";
        System.out.println("str = " + str);
        double num1=2.5;
        num1+=5.5;
        System.out.println("num1 = " + num1);
        double availableBalance=1000.50; //we need to deposit 300$
        availableBalance+=300;
        System.out.println("availableBalance = " + availableBalance); //new value 1300.5$
        System.out.println("---------------------------------");
      //withdrawing 500$
        availableBalance -=500; //sonuç 800.5
        System.out.println("availableBalance = " + availableBalance);
        //withdraw 200$, then deposit 400$.
        availableBalance-=200; //sonuç 600.5$
        availableBalance+=400; //sonuç 1000.5$
        System.out.println("availableBalance = " + availableBalance);
        System.out.println("------------------------------");
        double salary=5000.50;
        System.out.println("salary = " + salary);
        salary*=2;
        System.out.println("salary = " + salary);
        System.out.println("-------------------");
        double dodge=0.00000001;
        dodge*=1000000;
        System.out.println("dodge = " + dodge);
        System.out.println("-------------");
        double num2=25000;
        num2/=2;  //25000/2, o da 12500 yapar. Yeni değeri 12500 olur.
        System.out.println("num2 = " + num2);
        System.out.println("-----------------");
        int g=10;
        g%=3;
        System.out.println("g = " + g);
        System.out.println("-----------------------");
        int amount=127; //cents
        int quarters=amount/25;
        int cents=amount %5;
        System.out.println("quarters = " + quarters);
        System.out.println("cents = " + cents);
        int cents2=127;
        cents2%=25;
        System.out.println(cents2);
        System.out.println("-----------------");
        int y=300;
        y%=16;
        System.out.println("y = " + y);
        System.out.println("------------------");
        int balance=3500;
        // insurance fee:$153
        balance%=153;
        System.out.println("balance = " + balance); //we are finding the left over.


    }
}
