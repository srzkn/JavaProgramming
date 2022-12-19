package day17_while_DoWhileLoops;

import java.util.Scanner;

public class WhileLoopPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 0;
        while (i < 3) {
            i++;
            System.out.println("USERNAME:");
            String userName = scan.next();
            System.out.println("PASSWORD:");
            String passWord = scan.next();
            if (userName.equals("Cydeo") && passWord.equals("Cydeo123")) {
                System.out.println("Logged in");
                break;
            } else {
                if (i != 3)
                    System.err.println("username or password is incorrect. Please re-enter");
            }
        }
        if (i == 3)
            System.err.println("your account IS LOCKED!");
        scan.close();
    }
}
