package day11_Switch_Scanner;

public class NumberToWordsTernary {
    public static void main(String[] args) {
        int no=1;
        String st="";
        st= (no==0)? "Zero" :(no==1)? "One" :(no==2)? "Two" :(no==3)? "Three" :(no==4)? "Four"
                :(no==5)? "Five" :(no==6)? "Six" :(no==7)? "Seven" :(no==8)? "Eight" :(no==9)? "Nine"
                : "Invalid Entry";
        System.out.println(st);
    }
}
