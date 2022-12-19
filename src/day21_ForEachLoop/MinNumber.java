package day21_ForEachLoop;

public class MinNumber {
    public static void main(String[] args) {
        int []nums={34,3,1,345,76,8,99,};
        int min=nums[0];
        for (int num : nums) {
            if (num<min) min=num;
        }
        System.out.println(min);
    }
}
