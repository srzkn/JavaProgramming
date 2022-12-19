package day25_CusomMethod_Overloading;

public class T1 {
    public static void main(String[] args) {
        /*
        	    1. create a method that can find the sum of two numbers
	                    method name: sumOf2Numbers

	    2. create a method that can find the sum of three numbers
	                    method name: sumOf3Numbers

	    3. create a method that can find the sum of four numbers
	                    method name: sumOf4Numbers
         */
        int sum=sum(5,9);
        System.out.println(sum);
        int sum2=sum(5,9,14);
        System.out.println(sum2);
        int sum3=sum(5,9,14,28);
        System.out.println(sum3);
    }

    private static int sum(int a,int b) {
        return a+b;
    }
    private static int sum(int a,int b,int c) {
        return a+b+c;
    }
    private static int sum(int a,int b,int c,int d) {
        return a+b+c+d;
    }
}
