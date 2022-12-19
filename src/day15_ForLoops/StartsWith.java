package day15_ForLoops;

public class StartsWith {
    public static void main(String[] args) {
        String s="Adanadayız";
        System.out.println(s.startsWith("a"));
        System.out.println(s.startsWith("Adan"));
        System.out.println( s.endsWith("YIZ"));
        System.out.println(s.toUpperCase().endsWith("YIZ"));
    }
}
