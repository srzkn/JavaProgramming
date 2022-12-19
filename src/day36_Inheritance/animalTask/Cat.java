package day36_Inheritance.animalTask;

public class Cat extends Animal{ // Cat is an Animal

    public Cat(String name, String breed, char gender, int age, String size, String color){
        super(name, breed, gender, age, size, color);
    }
    public void scratch(){
        System.out.println(name+" is scratching");
    }

    public void meow(){
        System.out.println(name+" is meowing");
    }
}
