package day31_Constructors;

public class Person {
    public String name;
    public  char gender;
    public int age;


    public Person(String name, char gender, int age){
        this.name="Josh";
        this.gender='M';
        this.age=41;
    }





    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
