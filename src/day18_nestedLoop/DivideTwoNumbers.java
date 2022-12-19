package day18_nestedLoop;

import java.util.Scanner;

public class DivideTwoNumbers{
        public static void main(String[] args) {
            Scanner scan=new Scanner(System.in);
            System.out.println("Enter FIRST:");
            int i1=scan.nextInt();
            System.out.println("Enter SECOND");
            int i2=scan.nextInt();
            int times=0;
            while (i1>i2)
            {
                i1-=i2;
                times++;
            }
            System.out.println(times);

        }
}
