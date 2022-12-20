package day39_Recap.CydeoTask;

public class Student extends Person{
    private int studentId;
    private String fieldOfStudy;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        if (studentId<1){
            System.out.println("invalid student id: "+studentId);
            System.exit(1);
        }
        this.studentId = studentId;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        if (fieldOfStudy.isBlank()||fieldOfStudy.isEmpty()){
            System.out.println("field of study can not be blank");
            System.exit(1);
        }
        this.fieldOfStudy = fieldOfStudy;
    }

    public Student(String name, int age, char gender, int studentId, String fieldOfStudy) {
        super(name, age, gender);
        setStudentId(studentId);
        setFieldOfStudy(fieldOfStudy);
    }

    public void study(){
        System.out.println(getName()+" is studying "+fieldOfStudy);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", studentId=" + getStudentId() +
                ", fieldOfStudy='" + getFieldOfStudy() + '\'' +
                '}';
    }
}
