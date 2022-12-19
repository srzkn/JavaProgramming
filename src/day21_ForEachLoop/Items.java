package day21_ForEachLoop;

import java.util.Arrays;

public class Items {
    public static void main(String[] args) {
        String[]item={"A", "B", "C", "D", "E"};
        double[]prices={1,2,3,4,5};
        int[]itemIDs={100,200,300,400,500};
        String []sum=new String[item.length];
        System.out.println("name ID price");
        for (int j = 0; j < item.length; j++) {
            sum[j]=item[j]+" - "+prices[j]+" - "+itemIDs[j];
            System.out.println(sum[j]);
        }
        System.out.println(Arrays.toString(sum));
    }
}
