package day05_Concatenation;

public class FullName {
    public static void main(String[] args) {
        String firstName="Özkan";
        String lastName="Toker";
        String fullName=firstName+" "+lastName;
        String companyName="Apple";
        String jobTitle="SDET";
        double salary=120000.58;
        int age=40;
        System.out.println("Hi! My Name is "+fullName+" and I am "+age+" years old.");
        System.out.println(firstName+" is "+age+" years old.");
        System.out.println(fullName+" is "+jobTitle+", works at "+companyName+", and "+firstName
                +"'s salary is $"+salary);
    }
}
