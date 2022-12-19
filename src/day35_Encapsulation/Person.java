package day35_Encapsulation;

public class Person {
    public String name;
    public int age;
    public char gender;
    public String language;
    public static String planet;
    public static boolean isHuman, hasNose;
    public static int numberOfWings, numberOfHeads;

    public Person(String name, int age, char gender, String language) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.language = language;
    }

    static {
        planet="earth";
        isHuman=true;
        hasNose=true;
        numberOfWings=0;
        numberOfHeads=1;
    }

    public static void printPlanetName(){
        System.out.println("planet name is "+planet);
    }

    public void eat(String name){
        System.out.println(name+" is eating");
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", language='" + language + '\'' +
                ", planet name='" + planet + '\'' +
                '}';
    }
}


