package day21_ForEachLoop;

public class ForEachLoopPractice {
    public static void main(String[] args) {
        String[]words={"Java Programming", "Wooden Spoon", "Wooden Spoon", "Early Birds", "Angry Birds"};
        String result="";
        for (String word : words) {
            result+=word.charAt(0)+""+word.charAt(word.length()-1)+" ";
        }
        System.out.println(result);
        System.out.println("--------------------");
        for (String word : words) {
            String dummy="";
            dummy+=word.charAt(0)+""+word.charAt(word.length()-1);
            System.out.println(dummy);
        }
    }
}
