package day21_ForEachLoop;

public class Initials {
    public static void main(String[] args) {
        String[]classmates={"Ali Kaya", "Oya Basar", "Sen Ben", "Bu Su", "Dene Gör", "Şey Mey"};
        for (String name:classmates)
        {
            int a=name.indexOf(" ");
            System.out.println(name.charAt(0)+"."+name.charAt(a+1));
        }
    }
}
