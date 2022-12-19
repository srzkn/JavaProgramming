package day17_while_DoWhileLoops;

import java.util.Locale;
import java.util.Scanner;

public class JavaOrPython {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your sentence");
        String s = scan.nextLine().toLowerCase();
        int ja = 0;
        int pa = 0;

        while (s.contains("ja") || s.contains("pa"))
        {
            if (s.contains("ja")) {
                s.replaceFirst("ja", "");
                ja++;
            }
            if (s.contains("pa")) {
                s.replaceFirst("pa", "");
                pa++;
            }
        }
        System.out.println("there are " + ja + " ja and " + pa + " pa in that sentence.");
        scan.close();
    }
}
