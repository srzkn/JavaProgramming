package day30_customClass;

public class Employee {
    public String name;
    public int ID;
    public String jobTitle;
    public int salary;
    public boolean isFullTime;

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", ID=" + ID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", isFullTime=" + isFullTime +
                '}';
    }

    public void SetInfo(String name, int ID, String jobTitle, int salary, boolean isFullTime) {
        this.name = name;
        this.ID = ID;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.isFullTime = isFullTime;
    }

    public void work(){
        System.out.println(name+" works 8 hours a day");
    }

    public void drink(){
        System.out.println(name+ "is drinking coffee");
    }
}


