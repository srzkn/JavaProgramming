package day17_while_DoWhileLoops;

import java.util.Scanner;

public class FrequencyOfChar {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("please write a sentence");
        String s=scan.nextLine();
        System.out.println("please write a char");
        char ch=scan.next().charAt(0);
        int total=0;
        for (int i = 0; i < s.length(); i++) {
            if (ch==s.charAt(i))
                total+=1;
        }
        System.out.println("total number of "+ch+" is: "+total);
        scan.close();
    }
}
