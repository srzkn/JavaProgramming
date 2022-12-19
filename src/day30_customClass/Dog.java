package day30_customClass;

public class Dog {

    public String name;                 // ATTRIBUTES
    public String breed;                 // ATTRIBUTES
    public int age;                 // ATTRIBUTES
    public char gender;                 // ATTRIBUTES
    public String size;                 // ATTRIBUTES
    public  String color;                 // ATTRIBUTES

    public void setInfo(String dogName, String dogBreed, int dogAge, char dogGender, String dogSize, String dogColor){
        name=dogName;
        breed=dogBreed;
        age=dogAge;
        gender=dogGender;
        size=dogSize;
        color=dogColor;
    }
    public void eat(){                                                  // ACTIONS
        System.out.println(name+" is eating a lot!");
    }
    public void bark(){                                              // ACTIONS
        System.out.println(name+" does not bark in the morning");
    }

    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

/*
Attributes:
name,age,gender, breed, size, color

Actions:
eat(), play(), bark(), sleep()...
 */
