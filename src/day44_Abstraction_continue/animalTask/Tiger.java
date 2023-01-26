package day44_Abstraction_continue.animalTask;

public final class Tiger extends Animal implements WildAnimal{

    @Override
    public void eat() {
        System.out.println(getName()+" eats deer");
    }

    public Tiger(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void hunt() {
        System.out.println(getName()+" hunts deer.");
    }
}
