package day36_Inheritance.encapsulation;

public class Student {
    private String name;
    private int age;
    private char gender, grade;
    private String schoolName;

private String getName(){
    return name;
}

public int getAge(){
    return age;
}

public char getGender(){
    return gender;
}

    public char getGrade() {
        return grade;
    }

    public void setName(String name){
    if (!name.isBlank()) this.name=name;
    else return;
    }

    public void setAge (int age){
    if (age>4 && age<91) this.age=age;
    else return;
    }

    public void setGender(char gender){
    if (gender=='M'|| gender=='m'|| gender=='f'|| gender=='F') this.gender=gender;
    else return;
    }

    public void setGrade(char grade){
    if (grade=='A'|| grade=='B'|| grade=='C'|| grade=='D'|| grade=='F') this.grade=grade;
    else return;
    }

    public Student(String name, int age, char gender, char grade) {
        setName(name);
        setAge(age);
        setGender(gender);
        setGrade(grade);
    }

    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge()+
                ", gender=" + getGender() +
                ", grade=" + getGrade() +
                '}';
    }


}
