package day42_exceptions;

public class morningWorkout {
    public static void main(String[] args) {
        System.out.println("push-up started");
        for (int i = 0; i < 5; i++) {
            System.out.print("\rpush up "+i);

            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("push-up ended");
    }
}
