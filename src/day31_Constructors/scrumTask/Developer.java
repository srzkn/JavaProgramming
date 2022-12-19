package day31_Constructors.scrumTask;

public class Developer {
    public String name;
    public int employeeID;
    public String JobTitle;
    public int Salary;

    public Developer(String name, int employeeID, String jobTitle, int salary) {
        this.name = name;
        this.employeeID = employeeID;
        JobTitle = jobTitle;
        Salary = salary;
    }

    public void coding(){
        System.out.println(name+" is coding");
    }

    public void unitTesting(){
        System.out.println(name+" is unit testing");
    }

    public void fixingBug(){
        System.out.println(name+" is fixing bugs");
    }

    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", JobTitle='" + JobTitle + '\'' +
                ", Salary=" + Salary +
                '}';
    }
}
