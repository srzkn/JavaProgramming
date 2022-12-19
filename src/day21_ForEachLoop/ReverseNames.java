package day21_ForEachLoop;

public class ReverseNames {
    public static void main(String[] args) {
        String[] classmates = {"Ali Kaya", "Oya Basar", "Sen Ben", "Bu Su", "Dene Gör", "Şey Mey"};
        for (String name : classmates) {
            String reverse = "";
            int k = name.indexOf(" ");
            for (int i = k - 1; i >= 0; i--) {
                reverse += name.charAt(i);
            }
            reverse += " ";
            for (int i = name.length() - 1; i >= k + 1; i--) {
                reverse += name.charAt(i);
            }
            System.out.println(reverse);
        }
    }
}
