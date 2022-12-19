package day25_CusomMethod_Overloading;

import java.util.Arrays;

public class T2_AddElementsToArray {
    public static void main(String[] args) {
        /*
        		1. create a return method called addInteger that can add an Inteeger
        		after the  last index of an integer array

					{1,2,3,4}, 5
					new array ==> {1,2,3,4,5}

	    2. create a return method called addDouble that can add a double
	    after the last index of a double array

	    3. create a return method called addString that can add a String
	    after the last index of a String array

	    4. create a return method called addChar that can add a char
	    after last index of a char array
         */
        int[] a = {1, 2, 3, 4};
        a = add(a, 5);
        System.out.println(Arrays.toString(a));


        double[] b = {1, 2, 3, 4};
        b = add(b, 5);
        System.out.println(Arrays.toString(b));


        String[] c = {"A", "B", "C", "D"};
        c = add(c, "E");
        System.out.println(Arrays.toString(c));


        char[] d = {'a', 'b', 'c', 'd'};
        d = add(d, 'e');
        System.out.println(Arrays.toString(d));

    }
//adds the given integer to an integer array and returns it.
    public static int[] add(int[] i, int i2) {
        int[] arr = new int[i.length + 1];
        int counter = 0;
        for (int i1 : i) {
            arr[counter++] = i1;
        }
        arr[counter] = i2;
        return arr;
    }

    //adds the given double to a double array and returns it.
    public static double[] add(double[] i, double i2) {
        double[] arr = new double[i.length + 1];
        int counter = 0;
        for (double i1 : i) {
            arr[counter++] = i1;
        }
        arr[counter] = i2;
        return arr;
    }

    //adds the given String to a String array and returns it.
    public static String[] add(String[] i, String i2) {
        String[] arr = new String[i.length + 1];
        int counter = 0;
        for (String i1 : i) {
            arr[counter++] = i1;
        }
        arr[counter] = i2;
        return arr;
    }

    //adds the given char to a char array and returns it.
    public static char[] add(char[] i, char i2) {
        char[] arrchar = new char[i.length + 1];
        int counter = 0;
        for (char i1 : i) {
            arrchar[counter++] = i1;
        }
        arrchar[counter] = i2;
        return arrchar;
    }
}
