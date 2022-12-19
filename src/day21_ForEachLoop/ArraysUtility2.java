package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility2 {
    public static void main(String[] args) {
        String[]students={"elif", "sinem", "gunay", "cihad", "james", "aaron", "daniel"};
        String[]earlyBirds= Arrays.copyOf(students,students.length);
        System.out.println(Arrays.toString(students));
        System.out.println(Arrays.toString(earlyBirds));
        int[]numbers={1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(numbers));

                numbers=Arrays.copyOf(numbers,5);
        System.out.println(Arrays.toString(numbers));
        System.out.println("-------------------------------");
        char[]ch1={'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I'};
        char []ch2=Arrays.copyOfRange(ch1,1,7);
        System.out.println(Arrays.toString(ch2));
        System.out.println("----------------------");
        int[]newScores={1,2,3,4,5,6,7,8,9,10};
        int[]sc2=Arrays.copyOfRange(newScores,3,14);
        int[]sc3=Arrays.copyOfRange(newScores,newScores.length-3,newScores.length);
        System.out.println(Arrays.toString(sc3));
        System.out.println(Arrays.toString(sc2));

    }
}
