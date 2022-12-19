package day20_Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class ArraysPractice {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
  int []numbers=new int[4];
        for (int i = 0; i < 4; i++) {
            System.out.println("enter a number");
            numbers[i]=scan.nextInt();
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println("the third number you entered is : "+numbers[2]);
int []scores=new int[5];
        scores[3]=85;
        scores[scores.length-1]=95;
System.out.println(Arrays.toString(scores));







    }
}
