package day22_multiDimensionalArray;

public class ReverseTheSecond {
    public static void main(String[] args) {
        String s="I Love Java";
        String[]words=s.split(" ");
        String second=words[1];
        String reversed="";
        for (int i = second.length()-1; i>=0 ; i--) {
            reversed+=second.charAt(i);
        }
        words[1]=reversed;
        System.out.println(reversed);
        for (String word : words) {
            System.out.print(word+" ");
        }
        }
    }
