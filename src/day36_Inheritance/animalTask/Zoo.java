package day36_Inheritance.animalTask;

public class Zoo {
    public static void main(String[] args) {

        Dog dog=new Dog("max", "husky", 'M', 2, "Small", "Black");
        dog.eat();
        dog.drink();
        dog.move();
        dog.sleep();
        dog.bark();
        System.out.println(dog);

        Cat cat=new Cat("tekir","British", 'F', 5, "Big", "White" );
        cat.eat();
        cat.sleep();
        cat.drink();
        cat.move();
        cat.meow();
        cat.scratch();
        System.out.println(cat);

        Tiger tiger=new Tiger("Sher Khan", "bengal", 'M', 4, "Large", "Orange");
        tiger.eat();
        tiger.sleep();
        tiger.move();
        tiger.roar();
        tiger.hunt();
        System.out.println(tiger);






    }

}
