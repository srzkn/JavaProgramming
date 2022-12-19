package day35_Encapsulation;

public class CybertekStudent {
    public String name;
    public char gender;
    public int age;
    public int batchNumber;
    public int groupNumber;
    public static String schoolName;
    public String fieldOfStudy;
    public static String programmingLanguage;
    public static String secretCode;

    public CybertekStudent(String name, char gender, int age, int batchNumber, int groupNumber) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
    }

    static {
        schoolName="Cydeo";
        programmingLanguage="Java";
        secretCode="Wooden Spoon";
    }

    public String toString() {
        return "CybertekStudent{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", batchNumber='" + batchNumber + '\'' +
                ", groupNumber=" + groupNumber +
                ", school name=" + schoolName +
                ", field of study=" + fieldOfStudy +
                ", programming language=" + programmingLanguage +
                '}';
    }

    public static void programmingLanguage(){
        System.out.println("programming language is: "+programmingLanguage);
    }

    public static void printSchoolName(){
        System.out.println("school name : "+schoolName);
    }
    public void attendClass(){
        System.out.println(name+" is attending to the class");
    }

    public void study(){
        System.out.println(name+" is studying now");
    }
}
