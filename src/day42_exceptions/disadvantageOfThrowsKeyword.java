package day42_exceptions;

public class disadvantageOfThrowsKeyword {

    public static void main(String[] args) throws InterruptedException{

        System.out.println("hello");

        sleep(3);
        System.out.println("world");
    }
    public static void sleep(double seconds) throws InterruptedException {
        Thread.sleep((long)(seconds*1000));

    }
}
