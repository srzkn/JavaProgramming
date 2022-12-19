package day15_ForLoops;

public class StringMethods {
    public static void main(String[] args) {
        String s="";
        boolean b=s.isEmpty();
        System.out.println(b);
        boolean c=s.isBlank();
        System.out.println(c);
        System.out.println("---------------------------------");
        String s1="CYDEO";
        String s2="cydeo";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println("-----------------------------");
        String sentence="My favourite programming language is Java";
        System.out.println(sentence.contains("Java"));
        System.out.println(sentence.contains("C#"));
        System.out.println(sentence.toLowerCase().contains("java"));
        System.out.println("---------------------------------");
        String g1="I love jAva";
        String g2="Java";
        System.out.println(g1.equals(g2));
        System.out.println(g1.toUpperCase().contains("JAVA"));
    }
}
