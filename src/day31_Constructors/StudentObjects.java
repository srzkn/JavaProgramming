package day31_Constructors;

public class StudentObjects {
    public static void main(String[] args) {
        Student student1=new Student("ali", 18, 'M', 'A', 182);
        Student student2=new Student("esra", 12, 'F', 'C', 158);
        System.out.println("student1 = " + student1);
        System.out.println("student2 = " + student2);
    }
}
