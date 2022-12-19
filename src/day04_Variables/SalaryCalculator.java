package day04_Variables;

public class SalaryCalculator
{
    public static void main(String[] args) {
        //hourly rate, weekly hours
        int hourlyRate = 65;
        int weeklyHours = 45;
        int numberOfWeeks = 52;

        int salary = hourlyRate * weeklyHours * numberOfWeeks;

        System.out.println("hourly Rate = $" + hourlyRate);
        System.out.println("weekly Hours = " + weeklyHours);
        System.out.println("number Of Weeks = " + numberOfWeeks);
        System.out.println("salary = $" + salary);
    }
}
