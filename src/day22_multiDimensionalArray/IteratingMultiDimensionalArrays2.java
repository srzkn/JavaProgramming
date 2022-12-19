package day22_multiDimensionalArray;

public class IteratingMultiDimensionalArrays2 {
    public static void main(String[] args) {

        int arr2D[][]={{1,2,3,},{4,5,6,7,8},{9,10,11,12,13}};
        for (int i =arr2D.length-1; i>=0; i--) {
            for (int i1 = 0; i1 < arr2D[i].length; i1++) {
                System.out.print(arr2D[i][i1]+" ");
            }
            System.out.println();
            System.out.println("-----------------------------------------");
            for (int i1 = 0; i1 < arr2D.length; i1++) {
                for (int i2 = arr2D[i1].length - 1; i2 >= 0; i2--) {
                    System.out.print(arr2D[i1][i2]+" ");
                }
                System.out.println();
                System.out.println("--------------------------------------");
                for (int i2 = arr2D.length - 1; i2 >= 0; i2--) {
                    for (int i3 = arr2D[i2].length - 1; i3 >= 0; i3--) {
                        System.out.print(arr2D[i2][i3]+" ");
                    }
                    System.out.println();
                }

            }
        }








    }
}
