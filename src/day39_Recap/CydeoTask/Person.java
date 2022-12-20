package day39_Recap.CydeoTask;

public class Person {

    private String name;
    private int age;
    private char gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
       if (name.isBlank() || name.isEmpty()){
           System.out.println("name can not be blank");
           System.exit(1);
       } this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
       if (age<=1){
           System.out.println("invalid age: "+age);
           System.exit(1);
       } this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (!(gender=='m' || gender=='M' || gender=='f'|| gender=='F')){
            System.out.println("invalid gender: "+gender);
            System.exit(1);
        }this.gender = gender;
    }

    public Person(String name, int age, char gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                '}';
    }

    public void eat(){
        System.out.println(name+" is eating");
    }

    public void drink(){
        System.out.println(name+" is drinking");
    }

    public void sleep(){
        System.out.println(name+" is sleeping");
    }
}
