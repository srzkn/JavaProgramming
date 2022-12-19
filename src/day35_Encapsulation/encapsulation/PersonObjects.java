package day35_Encapsulation.encapsulation;

public class PersonObjects {
    public static void main(String[] args) {
        Person person1=new Person();
        person1.setName("Ali");
        person1.setAge(200);

        Person person2=new Person();
        person2.setName("Ayşe");
        person2.setAge(18);

        System.out.println(person1.getName()+" is "+person1.getAge()+" years old");
        System.out.println(person2.getName()+" is "+person2.getAge()+" years old");

    }
}
