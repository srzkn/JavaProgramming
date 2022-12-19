package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("how many numbers do you wanna enter?");
        int times=scan.nextInt();
        int[]numbers=new int[times];
        int min=numbers[0];
        int max=numbers[0];
        double total=0;

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("write a number");
            numbers[i]=scan.nextInt();
            if (min>numbers[i]) min=numbers[i];
            if (max<numbers[i]) max=numbers[i];
            total+=numbers[i];
        }
        System.out.println("Numbers u entered are         : "+Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("Numbers in ascending order are: "+Arrays.toString(numbers));
        System.out.println("The min number is             : "+min);
        System.out.println("The max number is             : "+max);
        System.out.println("The total of the numbers is   : "+total);
        System.out.println("The average of the numbers is : "+(total/times));
    }
}
