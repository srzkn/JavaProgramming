package day21_ForEachLoop;

public class AverageNumber {
    public static void main(String[] args) {
        int[]numbers={12,45,67,3,98,434,23};
        double total=0;
        for (int number : numbers) {
            total+=number;
        }
        System.out.println("average: "+(total/numbers.length));
    }
}
