package day14_String;

public class StringMethods2 {
    public static void main(String[] args) {
        String str="Java is fun, I love learning Java";
        String str2=str.replace("Java", "Python"); // "Python is fun, I love learning Python"
        System.out.println(str);
        System.out.println(str2);
        System.out.println("----------------------------------------");
        String email="AliKaya@yahoo.com";
        email=email.replace("yahoo", "gmail");
        System.out.println(email);
        System.out.println("----------------------------------------");
String s4="java java Python Python c++ c++ java java Python Python Python Python Python ";
s4=s4.replace("Python", "");
s4=s4.replace("   ", " ");
        System.out.println(s4);
        System.out.println("-------------------------------------");
        String g="Dog Dog Dog Dog Dog Dog Dog Dog Dog";
        System.out.println(g);
        g=g.replace("Dog", "Cat");
        System.out.println(g);
        System.out.println("-------------------------------------");
        String k="C# is fun, C# is cool";
        System.out.println(k);
        k=k.replace(" C#", " Java");
        System.out.println(k);
String f="Java";
        System.out.println(f);
        f=f.replace("a", "e");
        System.out.println(f);
        System.out.println("-------------------------------------");
        String gh="java java java";
        gh=gh.replaceFirst("java", "Python");
        System.out.println(gh);
        String ko="C# is fun, C# is cool";
        ko=ko.replaceFirst("C#", "java");
        System.out.println(ko);
    }
}
