package day32_constructors;

public class Employee2 {
    public String name;
    public char gender;
    public String jobTitle;
    public double salary;

    public Employee2(String name){
        this.name=name;
    }

    public Employee2(String name, char gender){
        this(name);             //this.name=name;
        this.gender=gender;
    }

    public Employee2(String name, char gender, String jobTitle){
        this(name, gender);     //this.name=name;
                                //this.gender=gender;
        this.jobTitle=jobTitle;
    }

    public Employee2(String name, char gender, String jobTitle, double salary){
        this(name,gender, jobTitle);
        this.salary=salary;
    }

    public Employee2() {

    }

    public void method1(){

    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
