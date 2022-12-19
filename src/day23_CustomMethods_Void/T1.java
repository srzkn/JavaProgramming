package day23_CustomMethods_Void;

public class T1 {
    public static void main(String[] args) {
        //Input: arr[] = {10, 4, 3, 50, 23, 90}
        //Output: 90
        int arr[] = {10, 4, 3, 50, 23, 90};
        int largest=arr[0]; //90
        for (int i : arr) {
            if (i>largest) largest=i;
        }
        System.out.println(largest);
    }
}
