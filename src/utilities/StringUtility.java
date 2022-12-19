package utilities;

import java.util.Arrays;

public class StringUtility {

    //prints each character of the given string
    public static void printEachChar(String str){
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }

    //reversed the given string and returns the reversed string
    public static String reverse(String str){
        String reversed="";
        for (int i =str.length()-1; i>=0; i--) {
            reversed+= str.charAt(i);
        }
        return reversed;
    }

    //checks if the given string is palindrome, returns boolean
    public static boolean isPalindrome(String str){
        return reverse(str).equalsIgnoreCase(str);
    }

    //returns the number of palindromes in a String array.
    public static int countPalindromes(String[]str){
        int count=0;
        for (String each : str) {
            if (StringUtility.isPalindrome(each)){
                count++;
            }
        }
        return count;
    }

    //checks if given two Strings are anagram, returns boolean.
    public static boolean isAnagram (String s1, String s2){
char[]c1=s1.toLowerCase().toCharArray();
Arrays.sort(c1);
char[]c2=s2.toLowerCase().toCharArray();
Arrays.sort(c2);
return Arrays.equals(c1,c2);
    }

    //removes the duplicates from a String, returns String.
    public static String removeDuplicates(String str){
        String result="";
        for (int i = 0; i < str.length(); i++) {
if (!result.contains(""+str.charAt(i))) result+=str.charAt(i);
        }
    return result;
    }
}
