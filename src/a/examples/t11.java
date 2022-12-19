package a.examples;

public class t11
{
    public static boolean method(String str){
        boolean s=true;
        if (str.isEmpty()){s=false;}
            if (!str.contains("a")){s=false;}
                else if (str.contains("z")){s=false;}
                s=str.substring(0,1).equals("a")? s :false;

                return s;
    }
    public static void main(String[] args) {
        System.out.println(method("apple"));

    }
}
