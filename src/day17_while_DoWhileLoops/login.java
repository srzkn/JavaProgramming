package day17_while_DoWhileLoops;

import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        int i = 0;
        while (i < 4) {
            i++;
            Scanner scan = new Scanner(System.in);
            System.out.println("username:");
            String userName = scan.next();
            System.out.println("password:");
            String passWord = scan.next();
            if (userName.equals("Cydeo") && passWord.equals("Cydeo123")) {
                System.out.println("Logged in.");
                i--;
                break;
            } else {
                if (i != 4) System.err.println("username or password is incorrect! RE_ENTER");
            }
        }
        if (i == 4) System.out.println("Your account is locked.");
    }
}
