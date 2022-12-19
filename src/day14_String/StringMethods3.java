package day14_String;

public class StringMethods3 {
    public static void main(String[] args) {
        String word = "Cydeo School";
        String word1 = word.substring(0, 5);
        System.out.println(word);
        System.out.println(word1);
        String word2 = word.substring(6);
        System.out.println(word2);
        System.out.println("---------------------------------------------------");
        String s = "Java Programming Language";
        String s1 = s.substring(0, (s.indexOf(" ")));
        String s2 = s.substring(s.indexOf(" ")+1, s.lastIndexOf(" "));
        String s3 = s.substring(s.lastIndexOf(" ")+1);
        System.out.println(s);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
