package day32_constructors;

public class EmployeeObjects2 {
    public static void main(String[] args) {
        Employee2 employee1=new Employee2("ali");
        System.out.println(employee1);

        Employee2 employee2=new Employee2("kemal", 'M');
        System.out.println(employee2);

        Employee2 employee3=new Employee2("esra", 'F', "QA");
        System.out.println(employee3);
    }
}
