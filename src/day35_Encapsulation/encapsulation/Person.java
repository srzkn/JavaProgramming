package day35_Encapsulation.encapsulation;

public class Person {
    private String name;
    private int age;

    public String getName(){
        return name;
    }

    public void setName(String name){
        if (name!="")
        this.name=name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        if (age>0 && age<101) this.age=age;
        else {
            System.out.println("invalid age: "+age);
            System.exit(0);
        }
    }












}



