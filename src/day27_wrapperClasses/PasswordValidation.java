package day27_wrapperClasses;

import java.util.Arrays;
import java.util.Scanner;

public class PasswordValidation {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("password");
        String passWord=scan.nextLine();
        char[]chars=passWord.toCharArray();
        int k=0;
        int l=0;
        int m=0;
        int n=0;
        int z=1;
        while (k!=1 || l!=1 || m!=1 || n!=1 || z!=1 || passWord.length()<8)

            if (passWord.length()<8) {
                System.err.println("your password should be at least 8 characters!");
                System.exit(0);
            }
        for (char aChar : chars) {
            if (Character.isDigit(aChar)) k=1;
            else if (!Character.isLetterOrDigit(aChar)) l=1;
            else if (Character.isUpperCase(aChar)) m=1;
            else if (aChar==' ') z=0;
            else if (Character.isLowerCase(aChar)) n=1;
        }
        if (k!=1 || l!=1 || m!=1 || n!=1 || z!=1)
        {
            System.err.println("invalid password!");
            System.exit(0);
        }
        else System.out.println("YES. A Valid password ;)");
    }
}
