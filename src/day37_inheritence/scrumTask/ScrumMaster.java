package day37_inheritence.scrumTask;

public class ScrumMaster extends Employee{
    public ScrumMaster(String name, int age, char gender, int id, double salary, String companyName) {
        super(name, age, gender, "scrum master", id, salary, companyName);
    }

}
