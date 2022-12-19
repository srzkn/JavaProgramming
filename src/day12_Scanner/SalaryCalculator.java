package day12_Scanner;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("What is your hourly rate?");
        int hourlyRate= input.nextInt();
        System.out.println("Total hours a week?");
        int hoursAWeek=input.nextInt();
        System.out.println("Enter the state tax rate");
        int stateTaxRate=input.nextInt();
        System.out.println("Enter the federal tax rate");
        int federalTaxRate= input.nextInt();
        double grossSalary=hourlyRate*hoursAWeek*52;
        double stateTax=grossSalary*(stateTaxRate/100.0);
        double federalTax=grossSalary*(federalTaxRate/100.0);
        System.out.println("Ok, here are your numbers:");
        System.out.println("Your gross salary is     :"+grossSalary);
        System.out.println("Your state tax is        :"+stateTax);
        System.out.println("Your federal tax is      :"+federalTax);
        System.out.println("Your Total Tax is        :"+(federalTax+stateTax));
        System.out.println("Your net income is       :"+(grossSalary-federalTax-stateTax));
        input.close();
    }
}
