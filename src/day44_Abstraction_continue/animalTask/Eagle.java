package day44_Abstraction_continue.animalTask;

public final class Eagle extends Animal implements WildAnimal, Flyable{
    @Override
    public void eat() {
        System.out.println(getName()+"eats snake");
    }

    public Eagle(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void hunt() {
        System.out.println(getName()+" hunts snakes");
    }


    @Override
    public void fly() {
            System.out.println(getName()+" can fly");
    }
}
