package day21_ForEachLoop;

public class MaximumNumber {
    public static void main(String[] args) {
        int[]numbers={12,4,56,4,10,8,66,30};
        System.out.println("---------------------------------");
        int max=numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]>max) max=numbers[i];
        }
        System.out.println(max);
        System.out.println("-----------------------------------");
        int max2=numbers[0];
        for (int i:numbers) {
            if (i>max2) max2=i;
        }
        System.out.println(max2);
        System.out.println("---------------------");
        int min=numbers[0];
        for (int number : numbers) {
            if (min>number) min=number;
        }
        System.out.println(min);
    }
}
