package day09_IfStatements;

public class MinNumber {
    public static void main(String[] args) {
        int n1=100, n2=200;
        boolean n2kucuk = n1>n2;
        boolean n1kucuk= n2>n1;
        boolean esit= n1==n2;
        if (n2kucuk) {
            System.out.println(n2+" is the minimum number");
        }
        if (n1kucuk) {
            System.out.println(n1+" is the minimum number");
        }
        if (esit) {
            System.out.println(n1+" and "+n2+" are equal");
        }
    }
} /** 	1. Create a class called MinNumber, Write a program that can print the minimum number between two numbers, if both are equal then print Equal

 Ex:
 n1= 100, n2 = 200;

 output:
 100 is the minimum number


 n1 & n2

 possibility #1: n1 is Min
 possibility #2: n2 is Min
 possibility #3: equal */
