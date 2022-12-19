package day21_ForEachLoop;

public class ForEachLoopIntro {
    public static void main(String[] args) {
        int[]numbers={1,2,3,4,5,6,7,8,9};
        for (int i:numbers)
        {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("=========================");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]+" ");
        }
    }
}
