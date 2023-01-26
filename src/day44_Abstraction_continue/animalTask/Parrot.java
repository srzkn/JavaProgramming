package day44_Abstraction_continue.animalTask;

public final class Parrot extends Animal implements Playable, Flyable{
    @Override
    public void eat() {
        System.out.println(getName()+" eats chocolate");
    }

    public Parrot(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void play() {
        System.out.println(getName()+" likes playing with people");
    }

    @Override
    public void fly() {
        System.out.println(getName()+"can fly slow");
    }
}
