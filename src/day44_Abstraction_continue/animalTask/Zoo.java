package day44_Abstraction_continue.animalTask;

public class Zoo {
    public static void main(String[] args) {
        Cat cat=new Cat("mirnav", "tuylu", 'F', 3, "small", "white");
        Dog dog=new Dog("it", "tuylu", 'F', 3, "small", "white");
        Eagle eagle=new Eagle("kartal", "tuylu", 'F', 3, "small", "white");
        Parrot parrot=new Parrot("papagan", "tuylu", 'F', 3, "small", "white");
        Tiger tiger=new Tiger("kaplan", "tuylu", 'F', 3, "small", "white");

        cat.eat();
        dog.eat();
        eagle.eat();
        parrot.eat();
        tiger.eat();

        cat.drink();
        dog.drink();
        eagle.drink();
        parrot.drink();
        tiger.drink();
    }
}
