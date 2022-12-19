package day30_customClass;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentObjects {
    public static void main(String[] args) {
        Student student1=new Student();
        student1.SetInfo("ali", 'M', 20,2151,'A');

        Student student2=new Student();
        student2.SetInfo("ayse", 'F', 67, 2100, 'B');

        Student student3=new Student();
        student3.SetInfo("Aygun", 'F', 28, 2244, 'C');

        Student student4=new Student();
        student4.SetInfo("Hulya", 'F', 26, 2123, 'A');

        Student student5=new Student();
        student5.SetInfo("Mert", 'M', 26, 2252, 'C');

        Student[] students={student1,student2,student3,student4,student5};
        for (Student student : students) {
            System.out.println(student);
        }
        ArrayList<Student>earlyBirds=new ArrayList<>();
        ArrayList<Student>angryBirds=new ArrayList<>(Arrays.asList(students));
        angryBirds.removeIf(p-> p.grade=='A');
        System.out.println("angryBirds: "+angryBirds);


        for (Student student : students) {
            if (student.grade=='A') earlyBirds.add(student);
        }
        System.out.println("---------------------");
        System.out.println(earlyBirds);
    }
}
