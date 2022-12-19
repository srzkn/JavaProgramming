package day35_Encapsulation.encapsulation;

public class EmployeeObjects {
    public static void main(String[] args) {
        Employee employee1=new Employee("ali", 'm', 39, 115000);
      //  employee1.setName("ali");
    //    employee1.setGender('m');
      //  employee1.setAge(39);
        //employee1.setSalary(115000);
        System.out.println("employee1 = " + employee1);
        employee1.setSalary(99999);
        employee1.setSalary(employee1.getSalary()+5001);
        System.out.println("employee1 = " + employee1);
        //System.out.println(employee1.getName()+" is "+employee1.getGender()+" and "+employee1.getAge()+ " years old. And "+employee1.getName()+ " makes "+ employee1.getSalary()+"$ a year." );
    }
}
