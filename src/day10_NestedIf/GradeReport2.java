package day10_NestedIf;

public class GradeReport2 {
    public static void main(String[] args) {
        int grade=45;
        String mes=(grade>=0 && grade<=100)? (grade>=90)? "Excellent" :(grade>80)? "Great" :(grade>=70)? "Good"
                :(grade>=60)? "Passed" : "Failed" :"Invalid Score";
        System.out.println(mes);
    }
}
