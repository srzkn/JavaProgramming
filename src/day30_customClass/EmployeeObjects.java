package day30_customClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class EmployeeObjects {
    public static void main(String[] args) {

        Employee employee1=new Employee();
        Employee employee2=new Employee();
        Employee employee3=new Employee();
        Employee employee4=new Employee();
        Employee employee5=new Employee();
        employee1.SetInfo("ali", 101, "ustabaşı", 15000, true);
        employee2.SetInfo("veli", 221, "kalfa", 10000, true);
        employee3.SetInfo("deli", 441, "çırak", 9000, true);
        employee4.SetInfo("kemal", 601, "amele", 8000, false);
        employee5.SetInfo("ozkan", 801, "amele", 8000, false);

        Employee[]employees={employee1,employee2,employee3,employee4,employee5};
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        ArrayList<Employee>list=new ArrayList<>(Arrays.asList(employees));
        System.out.println(list);
        System.out.println("--------------------------");
        int counter=0;

        for (Employee employee : employees) {
            if (employee.isFullTime) counter++;
        }
        System.out.println(counter);

        int max=employee1.salary;
        int min=employee1.salary;
        for (Employee employee : employees) {
            if (employee.salary>max) max=employee.salary;
            if (employee.salary<min) min=employee.salary;
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);












    }
}
