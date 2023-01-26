package day43_abstraction.Employee;

public class EmployeeObjects {
    public static void main(String[] args) {

        Tester tester=new Tester("aweli", 33, 'm', 3, "QA", 2222);
        Developer developer=new Developer("aqqqli", 35, 'F', 3, "dev", 2222);
        Teacher teacher=new Teacher("qqq", 22, 'm', 3, "teacher", 2222);
        Driver driver=new Driver("ddd", 11, 'F', 3, "driver", 2222);

        System.out.println(tester);
        System.out.println(developer);
        System.out.println(teacher);
        System.out.println(driver);
    }
}
