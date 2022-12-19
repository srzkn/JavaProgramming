package day17_while_DoWhileLoops;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str="AABBCC";
        String result="";
        for (int i = 0; i < str.length(); i++) {
            if (!result.contains(""+str.charAt(i)))
            result+=str.charAt(i);
        }
        System.out.println(result);
        System.out.println("----------------------------------------");
        for (int i = 0; i < str.length(); i++) {
            if (result.contains(""+str.charAt(i))) {
            continue;
            }
                result += str.charAt(i);
            }
        System.out.println(result);
    }
}
