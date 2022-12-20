package day39_Recap.CydeoTask;

public class Tester extends Employee{

    public Tester(String name, int age, char gender, int employeeId, String jobTitle, double salary) {
        super(name, age, gender, employeeId, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getJobTitle()+" "+getName()+ " is testing the application");
    }

    public void createTicket(){
        System.out.println(getJobTitle()+" "+getName()+" is creating ticket");
    }
}
