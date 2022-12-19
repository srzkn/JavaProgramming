package day22_multiDimensionalArray;
import java.util.Scanner;
public class NewOne {
        public static void main(String[] args) {
            //DO NOT TOUCH FOLLOWING LINE/LINES
            Scanner input = new Scanner(System.in);
            String word = input.nextLine();

            //WRITE YOUR CODE BELOW
            String []letters=word.split("");
            for (String letter:letters)
            {
                if (letter.equals("a")|| letter.equals("e") || letter.equals("i")||letter.equals("o")||letter.equals("u")) System.out.print(letter);
            }
            input.close();
        }
    }
