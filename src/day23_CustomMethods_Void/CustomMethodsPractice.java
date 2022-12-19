package day23_CustomMethods_Void;

public class CustomMethodsPractice {

    public static void main(String[] args) {
        helloWorld5Times();
        helloCydeo5Times();
        evenNumbersFrom1To10();










    }
    //method that prints hello world 5 times
    public static void helloWorld5Times(){
        for (int i = 0; i < 5; i++) {
            System.out.println("hello world");
        }
    }
    public static void helloCydeo5Times(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello Cydeo");
        }
    }
    public static void evenNumbersFrom1To10(){
        for (int i = 2; i <11 ; i+=2) {
            System.out.println(i);
        }
    }
}
