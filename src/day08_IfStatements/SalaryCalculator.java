package day08_IfStatements;

public class SalaryCalculator {
    public static void main(String[] args) {
        int hourlyRate=65,
            weeklyHours=40;
        double stateTaxRate=0,
                federalTaxRate=26.2;
        int salaryBeforeTax=hourlyRate*weeklyHours*52;
        double stateTax=salaryBeforeTax*stateTaxRate/100;
        double federalTax=salaryBeforeTax*federalTaxRate/100;
        double totalTax=stateTax+federalTax;
        double salaryAfterTax=salaryBeforeTax-totalTax;
        System.out.println("Gross pay is   : $"+salaryBeforeTax);
        System.out.println("Federal tax is : $"+federalTax);
        System.out.println("State tax is   : $"+stateTax);
        System.out.println("Total tax is   : $"+totalTax);
        System.out.println("Net income  is : $"+salaryAfterTax);
    }
}
