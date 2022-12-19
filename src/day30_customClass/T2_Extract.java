package day30_customClass;

import java.util.ArrayList;
import java.util.Arrays;

public class T2_Extract {
    public static void main(String[] args) {
        String str="ABCD123+%&//(()456EFG!";
        char[]ch=str.toCharArray();
        ArrayList<Character>list=new ArrayList<>();
        for (char each : ch) {
            list.add(each);
        }
        System.out.println("list = " + list);
        ArrayList<Character>numbers=new ArrayList<>(list);
        numbers.removeIf(p-> !Character.isDigit(p));
        System.out.println("numbers = " + numbers);

        ArrayList<Character>letters=new ArrayList<>(list);
        letters.removeIf(p-> !Character.isLetter(p));
        System.out.println("letters = " + letters);

        ArrayList<Character>specialCharacters=new ArrayList<>(list);
        specialCharacters.removeIf(p-> Character.isLetterOrDigit(p));
        System.out.println("specialCharacters = " + specialCharacters);
    }
}
