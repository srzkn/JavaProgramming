package day43_abstraction.Employee;

public final class Driver extends Employee{
    public Driver(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+" drives");
    }

    @Override
    public void sleep() {
        System.out.println(getName()+" sleeps 9 hours");
    }
}
