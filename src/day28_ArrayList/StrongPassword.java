package day28_ArrayList;

import java.util.Scanner;

public class StrongPassword {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("write a password");
        String pass=scan.nextLine();
        boolean result=strongPassword(pass);
        System.out.println(result);
    }
    public static boolean strongPassword(String pass){
        char[]chars=pass.toCharArray();

            int a=0;
            int b=1;
            int c=0;
            int d=0;
            int e=0;
            int f=0;
        if (pass.length()>=8) a=1;
        for (char each : chars) {
            if (Character.isSpaceChar(each)) b=0;
            else if (Character.isUpperCase(each)) c=1;
            else if (Character.isLowerCase(each)) d=1;
            else if (!Character.isLetterOrDigit(each)) e=1;
            else if (Character.isDigit(each)) f=1;
        }
        return (a==1 && b==1 && c==1 && d==1 && e==1 && f==1);
    }
}
