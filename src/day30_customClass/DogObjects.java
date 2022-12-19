package day30_customClass;

import java.util.ArrayList;

public class DogObjects {
    public static void main (String[] args){

    Dog dog1=new Dog();
    dog1.name="Lucy";
    dog1.breed="karabas";
    dog1.age=8;
    dog1.gender='M';
    dog1.size="big";
    dog1.color="gray";
    System.out.println(dog1);

    Dog dog2=new Dog();
    dog2.name="gur";
    dog2.breed="karabas";
    dog2.age=1;
    dog2.gender='F';
    dog2.size="big";
    dog2.color="black";
    System.out.println(dog2);

    Dog dog3=new Dog();
    dog3.setInfo("kek", "German Shepard", 2, 'M', "Huge", "Yellow");
        System.out.println(dog3);

        dog1.eat();
        dog2.bark();

        Dog dog4=new Dog();
        dog4.setInfo("mersin","coban kopegi",40,'F',"tiny","pink");

        Dog dog5=new Dog();
        dog5.setInfo("sincap", "kırma", 1, 'M', "eşşek kadar", "morumsu");


        Dog[]benimItler={dog1,dog2,dog3,dog4,dog5};
        for (Dog dog : benimItler) {
            System.out.println(dog);
        }
        ArrayList<Dog>femaleDogs=new ArrayList<>();
        ArrayList<Dog>maleDogs=new ArrayList<>();
        for (Dog dog : benimItler) {
            if (dog.gender=='F') femaleDogs.add(dog);
            else maleDogs.add(dog);
        }
        System.out.println("female dogs are: "+femaleDogs);
        System.out.println("male dogs are: "+maleDogs);
    }





}
