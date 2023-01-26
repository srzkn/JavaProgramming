package day47_Polymorphism;

import day44_Abstraction_continue.animalTask.Animal;
import day44_Abstraction_continue.animalTask.Dog;
import day45_interface.shape.Circle;
import day45_interface.shape.Shape;

public class ReferenceTypeCastings {
    public static void main(String[] args) {

        Animal animal=new Dog("kara", "sokak", 'M', 44, "small", "white");
        ((Dog)animal).bark();



    }
}
