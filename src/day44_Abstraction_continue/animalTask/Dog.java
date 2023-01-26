package day44_Abstraction_continue.animalTask;

public final class Dog extends Animal implements Playable{

    public Dog(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" eats Pizza");
    }

    public void bark(){
        System.out.println(getName()+" is barking");
    }

    @Override
    public void play() {
        System.out.println(getName()+ " plays everytime");
    }
}
