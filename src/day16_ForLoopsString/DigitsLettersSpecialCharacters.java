package day16_ForLoopsString;

import java.util.Scanner;

public class DigitsLettersSpecialCharacters {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("write a sentence");
        String sentence=scan.nextLine();
        String digits="";
        String letters="";
        String specials="";
        for (int i = 0; i < sentence.length(); i++) {
            char c=sentence.charAt(i);
            if(c>='0' && c<='9') digits+=c;
            else if((c>='a' && c<='z') || (c>='A' && c<='z')) letters+=c;
            else {
                if (c!=' ')
                    specials+=c;
            }
        }
        System.out.println("digits are: "+digits);
        System.out.println("letters are: "+letters);
        System.out.println("special characters are: "+specials);
        scan.close();
    }
}
