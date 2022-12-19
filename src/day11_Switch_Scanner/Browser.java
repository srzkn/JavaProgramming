package day11_Switch_Scanner;

public class Browser {
    public static void main(String[] args) {
        String message = "";
        String browserName = "edge";
        boolean valid = browserName == "chrome" || browserName == "firefox" || browserName == "opera"
                || browserName == "safari" || browserName == "edge";
        if (valid) {
            message = browserName + " Browser is selected";
        } else {
            message = "Invalid Browser Name";
        }
        System.out.println(message);
    }
}
