package day46_Polymorphism;

import day43_abstraction.Employee.Developer;
import day43_abstraction.Employee.Employee;
import day43_abstraction.Employee.Tester;

import java.util.ArrayList;
import java.util.List;

public class EmployeeTask {
    public static void main(String[] args) {
        Employee []employees={
                new Tester("Sherali", 32, 'M',1, "QA", 110000),
                new Developer("Zuhal", 27, 'F', 2, "Java Developer", 128000),
                new Tester("George", 28,'M', 3, "SDET", 120000),
                new Developer("Cristina", 23, 'F',4, "Software Developer", 135000),
                new Tester("Cihad", 30, 'M',5, "SDET", 105000),
                new Developer("Gulistan",  26, 'F',6, "Web Developer", 130000),
                new Tester("Yuliya",  28, 'F',7, "QE", 120000),
                new Developer("Cassendra",  29, 'F',8, "Front-end Developer", 140000),
                new Tester("Aygu",  25, 'F',9, "SDET", 130000),
                new Developer("Sophie",  26, 'F',10, "Back-end Developer", 150000),
                new Tester("Timur",  29, 'M',11, "SDET", 115000),
                new Developer("Fady",  26, 'F',12, "Full Stack Developer", 142000),
                new Tester("Iryna",  24, 'F',13, "QE", 125000),
                new Developer("Enes",  26, 'M',14, "Full Stack Developer", 142000),
                new Tester("Mikael",  30, 'M',15, "SDET", 105000)
        };

        List<Employee> scrumMembers = new ArrayList<>();
        List<Tester> testers = new ArrayList<>();
        List<Developer> developers = new ArrayList<>();

        for (Employee eachEmployee : employees) {
            scrumMembers.add(eachEmployee);
            if (eachEmployee instanceof Tester) testers.add((Tester) eachEmployee);
            else if (eachEmployee instanceof Developer) developers.add( (Developer) eachEmployee);
        }

        System.out.println("-----------------------------------------");
        System.out.println("scrumMembers = " + scrumMembers);
        System.out.println("scrumMembers.size() = " + scrumMembers.size());
        System.out.println("-----------------------------------------");
        System.out.println("testers = " + testers);
        System.out.println("testers.size() = " + testers.size());
        System.out.println("-----------------------------------------");
        System.out.println("developers = " + developers);
        System.out.println("developers.size() = " + developers.size());
        System.out.println("-----------------------------------------");

        Tester testerWithMaxSalary=null;
        double MaxTesterSalary=Integer.MIN_VALUE;

        for (Tester eachTester : testers) {
        if (eachTester.getSalary()>=MaxTesterSalary)
        {
            MaxTesterSalary= eachTester.getSalary();
            testerWithMaxSalary=eachTester;
        }
        }

        Developer developerWithMaxSalary=null;
        double MaxDeveloperSalary=Integer.MIN_VALUE;

        for (Developer eachDeveloper : developers) {
            if (eachDeveloper.getSalary()>=MaxDeveloperSalary)
            {
                MaxDeveloperSalary= eachDeveloper.getSalary();
                developerWithMaxSalary=eachDeveloper;
            }
        }

        System.out.println("-----------------------------------------");
        System.out.println("developerWithMaxSalary = " + developerWithMaxSalary);
        System.out.println("-----------------------------------------");
        System.out.println("testerWithMaxSalary = " + testerWithMaxSalary);
        System.out.println("-----------------------------------------");
    }



}
