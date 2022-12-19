package day35_Encapsulation.encapsulation;

public class Employee {
    private String name;
    private char gender;
    private int age;
    private double salary;

    public Employee(String name, char gender, int age, double salary) {
        setName(name);
        setGender(gender);
        setAge(age);
        setSalary(salary);
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        if (name.isBlank()) {return;}
         else {this.name=name;}
    }

    public char getGender(){
        return gender;
    }

    public void setGender(char gender){
        if (gender=='m' || gender=='M' || gender=='f' || gender=='F') this.gender=gender;
        else return;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        if (age>15 && age <=90) this.age=age;
        else return;
    }

    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary){
        if (salary>0) this.salary=salary;
    }


}
