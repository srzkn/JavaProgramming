package day17_while_DoWhileLoops;

import java.util.Scanner;

public class MarriageProposalWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Will you marry me");
        String reply = scan.next().toLowerCase();

        while (!(reply.equals("yes") || reply.equals("no")))
        {
            System.err.println("Invalid answer, please re-enter. yes/no");
            reply = scan.next().toLowerCase();
        }
        if (reply.equals("yes"))
            System.out.println("Congrats");
        else System.out.println("Goodbye");
        scan.close();
    }
}