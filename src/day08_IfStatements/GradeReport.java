package day08_IfStatements;

public class GradeReport {
    public static void main(String[] args) {
int score = 85;
        boolean a= (score>=90 && score <=100); //false
        boolean b =  (score>=80 && score <=89); // true
                // or you can write (score>=80 && !a)
        boolean c = (score>=70 && score <=79); //false
                // (score>=70 && !a && !b  greater than or equal to 70 but not b and not a
        boolean d = (score>=60 && score <=69); //false
                 // (score>=60 && !a && !b && !c
        boolean e = (score>=0 && score <=59); //false
        if (a) {System.out.println("Excellent");}
        if (b) {System.out.println("Great");}
        if (c) {System.out.println("Good");}
        if (d) {System.out.println("Passed");}
        if (e) {System.out.println("Failed");}
                                            }
}