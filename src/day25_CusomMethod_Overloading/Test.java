package day25_CusomMethod_Overloading;

import utilities.ArraysUtility;
import utilities.StringUtility;

public class Test {
    public static void main(String[] args) {
        StringUtility.printEachChar("deneme 123");
        String rev=StringUtility.reverse("portekiz");
        System.out.println(rev);
        System.out.println("-----------------------------------");

        String s1="Wooden Spoon";
        String reverse=StringUtility.reverse(s1);
        System.out.println(reverse);
        System.out.println("-----------------------------------");

        boolean result=StringUtility.isPalindrome("Adanada");
        System.out.println(result);
        System.out.println("-----------------------------------");

        String[]names={"Anna", "Java", "Python", "RaceCar", "MOm", "Cydeo"};
        int count=StringUtility.countPalindromes(names);
        System.out.println("number of palindromes= " + count);
        System.out.println("-----------------------------------");

        String s11="Nerede";
        String s22="derEne";
        boolean anagram=StringUtility.isAnagram(s11,s22);
        System.out.println(anagram);
        System.out.println("-----------------------------------");

        String ss="remover the duplicates from this string";
        ss=StringUtility.removeDuplicates(ss);
        System.out.println(ss);
        System.out.println("-----------------------------------");

    int[]a={1,3,5,7,9};
        ArraysUtility.printEachElement(a);
    }
}
