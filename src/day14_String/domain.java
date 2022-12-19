package day14_String;

public class domain {
    public static void main(String[] args) {
        String s="Cydeo.School@yahoo.com";
        String domain=s.substring(s.indexOf("@")+1, s.lastIndexOf("."));
        System.out.println(domain);
        System.out.println("-------------------------------------");
        String a="Java is fun, Java is cool, I love Java";
        String b=a.substring(0, a.indexOf(","));
        System.out.println(b);
        String c=a.substring(a.indexOf(",")+2, a.lastIndexOf(","));
        System.out.println(c);
    }
}
