package a.examples;

public class T10 {
    public static void main(String[] args) {
       int result=method2('z', "zebra");
        System.out.println(result);
    }

    public static int method2(char c, String s) {
if (s.contains(""+c)) return 1;
 else      return 0;
    }
}