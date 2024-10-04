package projects;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        int date;
        int year;
        int month;
        
        // Scanner to get user input
        Scanner sc = new Scanner(System.in);
        
        // Get the current date
        LocalDate currentdate = LocalDate.now();
        
        // Get the user's birth date from input
        System.out.println("Enter your date of birth (day):");
        date = sc.nextInt();
        
        System.out.println("Enter your birth month (number):");
        month = sc.nextInt();
        
        System.out.println("Enter your birth year:");
        year = sc.nextInt();
        
        // Create a LocalDate object for the birth date
        LocalDate birthday = LocalDate.of(year, month, date);
        
        // Check if the birthdate is in the future or past
        if (birthday.isAfter(currentdate)) {
            System.out.println("You have entered a future date. Please check the details.");
        } else if (birthday.isBefore(currentdate)) {
            // Calculate the age using Period.between
            Period age = Period.between(birthday, currentdate);
            System.out.println("Your age is: " + age.getYears() + " years, " +
                    age.getMonths() + " months, and " +
                    age.getDays() + " days old.");
        } else {
            System.out.println("You entered today's date, so you are 0 years old!");
        }
        
        // Close the scanner
        sc.close();
    }
}
