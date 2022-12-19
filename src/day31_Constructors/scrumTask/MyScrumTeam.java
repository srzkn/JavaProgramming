package day31_Constructors.scrumTask;

public class MyScrumTeam {
    public static void main(String[] args) {
        Tester tester1=new Tester("ali", 101,"QA", 100000);
        Tester tester2=new Tester("ayşe", 108,"SDET", 140000);
        Tester tester3=new Tester("fadime", 131,"QE", 130000);
        Tester tester4=new Tester("Esra", 121,"QA", 120000);

        Tester[]testers={tester2,tester3,tester4};

        Developer developer1=new Developer("Sarı", 103, "Develeper", 160000);
        Developer developer2=new Developer("Mor", 104, "Develeper", 155000);
        Developer developer3=new Developer("Pink", 150, "Develeper", 140000);
        Developer developer4=new Developer("Black", 160, "Develeper", 120000);
        Developer developer5=new Developer("Gogo", 107, "Develeper", 120000);

        Developer[]developers={developer2,developer3,developer4};

        ScrumTeam scrum=new ScrumTeam("Alev", "Paris", "Huseyin",14);
        System.out.println(scrum);
        scrum.addTester(tester1);
        scrum.addTesters(testers);

        System.out.println(scrum);
        scrum.addDeveloper(developer1);
        scrum.addDevelopers(developers);
        System.out.println(scrum);
        System.out.println("-------------------------------------");
        for (Tester tester : scrum.testersList) {
            System.out.println(tester.name+" : "+tester.Salary);
        }
        System.out.println("-----------------------------");
        for (Developer developer : scrum.devopsList) {
            System.out.println(developer.name+" : "+developer.JobTitle+" : "+developer.Salary);
        }
        System.out.println("--------------------------------------------------");
        scrum.removeTester(121);
        System.out.println(scrum.testersList);
        System.out.println(scrum);
        scrum.removeDeveloper(103);
        System.out.println(scrum);
    }
}
