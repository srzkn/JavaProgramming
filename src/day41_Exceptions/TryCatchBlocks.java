package day41_Exceptions;

public class TryCatchBlocks {
    public static void main(String[] args) {
        int[]numbers={1,2,3,4,5};
        System.out.println("test Started");

        try{
           System.out.println(numbers[200]);
       }

        catch (ArrayIndexOutOfBoundsException e)
        {
           e.printStackTrace();

            //System.out.println(e.getMessage());
        }

        System.out.println("test Completed");
        System.out.println("------------------------------------------");
        System.out.println("NEW");
        try {
            System.out.println("cydeo".substring(2,0));
        }
        catch (RuntimeException r){
            r.printStackTrace();
        }


        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        System.out.println("sonnn");

    }
}
