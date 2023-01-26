package day44_Abstraction_continue.animalTask;

public final class Cat extends Animal implements Playable{

    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" eats Biryani");
    }

    public static void main(String[] args) {
        Cat cat=new Cat("nirnav", "tuylu", 'M', 22, "small", "white");
        System.out.println("cat = " + cat);
    }

    @Override
    public void play() {
        System.out.println(getName()+" likes playing");
    }
}
