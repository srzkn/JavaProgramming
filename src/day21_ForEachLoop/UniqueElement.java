package day21_ForEachLoop;

public class UniqueElement {
    public static void main(String[] args) {
      String[]words={"Layan", "Layan", "Oleksandr","Olga", "Adam", "Adam", "Adam", "Cihad", "Cihad", "Cydeo"};
      String uniques="";
      for (String each : words)
      {
          int count=0;
          for (String word : words) {
              if (each.equals(word)) count++;
          }
          if (count==1) uniques+=each+" ";
      }
        System.out.println(uniques);
    }
}
