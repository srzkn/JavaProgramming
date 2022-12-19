package day25_CusomMethod_Overloading;

public class T4_Max {
    public static void main(String[] args) {
        int[] arr = {1, 5, 0, 17, 44};
        int max = max(arr);
        System.out.println(max);

        double[] arr1 = {1.6, 5.7, 0.5, -747.6, 440.4};
        double maxd = max(arr1);
        System.out.println(maxd);

        long[] arrl = {31, 54, 02, 727, 424};
        long maxl = max(arrl);
        System.out.println(maxl);

        long[] arrs = {331, 354, 302, 377, 344};
        long maxs = max(arrs);
        System.out.println(maxs);
    }

    public static int max(int[] arr) {
        int max = arr[0];
        for (int i : arr) {
            if (i > max) max = i;
        }
        return max;
    }

    public static double max(double[] arr) {
        double max = arr[0];
        for (double i : arr) {
            if (i > max) max = i;
        }
        return max;
    }

    public static long max(long[] arr) {
        long max = arr[0];
        for (long i : arr) {
            if (i > max) max = i;
        }
        return max;
    }

    public static short max(short[] arr) {
        short max = arr[0];
        for (short i : arr) {
            if (i > max) max = i;
        }
        return max;
    }
}
