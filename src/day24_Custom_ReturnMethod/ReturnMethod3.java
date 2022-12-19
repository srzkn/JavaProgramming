package day24_Custom_ReturnMethod;

public class ReturnMethod3 {
    public static void main(String[] args) {
        String str="aabccdee";
        for (int i = 0; i < str.length(); i++) {
            int freq=frequencyOfLetters(str,str.charAt(i));
            if (freq==1) System.out.print(str.charAt(i)+" ");
        }
        int[]nums={23,4546,78,45,34,76,34,787,989,898,65,3,1};
        int max=maximumNumber(nums);
        System.out.println(max);
        System.out.println();
        String renewed=removeDuplicatedCharacters("kjdsf kdsfsgdjhsj gsjgfsjdfjgfjsgfjsgfjgsfjgsfgsfsf");
        System.out.println(renewed);

        int result= sum(5,9);
        System.out.println(result*5);
    }

    public static int sum(int i, int i1) {
        int result=i+i1;
        return result;
    }

    public static int frequencyOfLetters(String str, char c){
        int counter=0;
        for (int i = 0; i < str.length(); i++) {
if(c==str.charAt(i)) counter++;
        }
        return counter;
    }
    public static String removeDuplicatedCharacters(String sr){
        String result="";
        for (int i = 0; i < sr.length(); i++) {
            if (!(result.contains(sr.charAt(i)+""))) result+=sr.charAt(i);
        }
        return result;
    }
public static int maximumNumber(int[]i){
    int max=i[0];
        for (int i1 : i) {
        if (i1>max) max=i1;
    }
        return max;
}
}

