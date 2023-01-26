package day41_Exceptions;

import day39_Recap.CydeoTask.Employee;

public class MultiCatchBlocks {
    public static void main(String[] args) {

        Employee employee=null;

        try {
            System.out.println(employee.getSalary());
        }catch (IndexOutOfBoundsException e){
            System.out.println("first catch block");
            e.printStackTrace();
        }catch (ArithmeticException e){
            System.out.println("second catch block");
            e.printStackTrace();
        } catch (NullPointerException e){
            System.out.println("third catch block");
            e.printStackTrace();
        }catch (RuntimeException e){
            System.out.println("fourth catch block");
            e.printStackTrace();
        }
        System.out.println("test COMPLETED");
}
}
