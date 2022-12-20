package day39_Recap.CydeoTask;

public class Cydeo {
    public static void main(String[] args) {
        Tester tester=new Tester("ali kaya", 40, 'M', 01, "QA", 123000);
        Developer developer=new Developer("ayse toker", 70, 'F', 02, "Developer", 140000);
        Teacher teacher=new Teacher("Adam Jack", 37, 'M', 03, "Java Teacher", 150000);
        Student student = new Student("Ozkan Toker", 41, 'M', 05, "Java");
        System.out.println("tester = " + tester);
        System.out.println("developer = " + developer);
        System.out.println("teacher = " + teacher);
        System.out.println("student = " + student);
        System.out.println("----------------------------------");
        tester.work();
        developer.work();
        teacher.work();
        System.out.println("---------------------------------------");

    }
}
