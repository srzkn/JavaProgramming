package day39_Recap.CydeoTask;

public class Employee extends Person{

    private int employeeId;
    private String jobTitle;
    private double salary;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        if (employeeId<1){
            System.out.println("invalid employee ID: "+employeeId);
            System.exit(1);
        }
        this.employeeId = employeeId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
       if (jobTitle.isEmpty()|| jobTitle.isBlank()){
           System.out.println("Job title can not be empty");
           System.exit(1);
       }
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary<1){
            System.out.println("salary can not be zero or less");
            System.exit(1);
        }this.salary = salary;
    }

    public Employee(String name, int age, char gender, int employeeId, String jobTitle, double salary) {
        super(name, age, gender);
        setEmployeeId(employeeId);
        setJobTitle(jobTitle);
        setSalary(salary);
    }

    public void work(){
        System.out.println(getName()+" is working");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", employeeId=" + getEmployeeId() +
                ", jobTitle='" + getJobTitle() + '\'' +
                ", salary=" + getSalary() +
                '}';
    }


}
