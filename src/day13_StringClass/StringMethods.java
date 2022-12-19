package day13_StringClass;

public class StringMethods {
    public static void main(String[] args) {
        String word="Cydeo";

        char thirdCharacter=word.charAt(2);
        System.out.println(thirdCharacter);
        System.out.println("--------------------------------------");
        String st="Batch 25 is the best batch";
        int totalChars=st.length();
        System.out.println(totalChars);
        String s="JAVA";
        System.out.println(s);
        System.out.println(s.toLowerCase());
        String s1=s.toLowerCase();
        System.out.println(s1);
    }
}
