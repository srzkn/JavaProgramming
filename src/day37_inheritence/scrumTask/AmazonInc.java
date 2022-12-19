package day37_inheritence.scrumTask;

public class AmazonInc {
    public static void main(String[] args) {
        String company="Amazon Inc";
ProductOwner po=new ProductOwner("alex", 34, 'M', 1, 145000, company);
BusinessAnalyst ba=new BusinessAnalyst("jack", 44, 'M', 2, 200000, company);
ScrumMaster sm=new ScrumMaster("she", 20,'F',3,100000,company);

Tester tester1=new Tester("Rabia", 22,'F',"QA", 4,234555, company);
Tester tester2=new Tester("Rock", 26,'M',"SDET", 45,234000, company);
Tester tester3=new Tester("George", 25,'M',"QE", 42,234055, company);
Tester tester4=new Tester("Sue", 42,'F',"SDET", 14,234505, company);
Tester[]testers={tester1,tester2,tester3,tester4};


        Developer Developer1=new Developer("Rabia", 22,'F',"Dev", 411,234555, company);
        Developer Developer2=new Developer("Rock", 26,'M',"Java Developer", 4115,234000, company);
        Developer Developer3=new Developer("George", 25,'M',"DEV QE", 4112,234055, company);
        Developer Developer4=new Developer("Sue", 42,'F',"DEV SDET", 1114,234505, company);
        Developer[]Developers={Developer1,Developer2,Developer3,Developer4};

        ScrumTeam scrumTeam=new ScrumTeam(po, ba, sm);
        scrumTeam.addDeveloper(Developer1);
        scrumTeam.addTesters(testers);
        System.out.println(scrumTeam);

        System.out.println("--------------------------------");
        for (Tester tester : testers) {
            System.out.println(tester.name+ " : "+ tester.salary);
        }

    }
}
