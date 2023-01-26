package day41_Exceptions;

public class FinallyBlock {
    public static void main(String[] args) {

int[]nums={1,2,3};
try {
    System.out.println(nums[5]);
    System.out.println("try");
}catch (ArrayIndexOutOfBoundsException e){
    e.printStackTrace();
    System.out.println("catch");
}finally {
    System.out.println("finally");
}



    }
}
