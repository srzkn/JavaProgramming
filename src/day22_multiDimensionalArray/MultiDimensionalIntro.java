package day22_multiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalIntro {
    public static void main(String[] args) {
        String[][]groups=new String[3][];
        String[]group1={"Jon", "Jack", "Jane"};
        String[]group2={"ali", "Ben", "Jane"};
        String[]group3={"kemal", "Jack", "Jane"};
        groups[0]=group1;
        groups[1]=group2;
        groups[2]=group3;
        System.out.println(Arrays.deepToString(groups));
        System.out.println("----------------");
        int[][]nums={{1,2,3},{4,5,6,7},{8,9,10,11,12}};
        System.out.println(nums.length);
        System.out.println(Arrays.deepToString(nums));
        System.out.println(Arrays.toString(nums[1]));
        System.out.println(nums[1][1]);
        System.out.println("-----------------------");
        System.out.println(Arrays.toString(nums[1]));
        System.out.println(nums[2][3]);
        for (int i=0; i<nums.length; i++)
        {
            for (int j=0; j<nums[i].length; j++)
            {
                System.out.print(nums[i][j]+" ");
            }
        }
        }
    }
