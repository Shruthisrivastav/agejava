import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Get the current year
        int currentYear = 2024;

        // Ask the user for their year of birth
        System.out.print("Enter your year of birth: ");
        int birthYear = scanner.nextInt();

        // Calculate the age
        int age = currentYear - birthYear;

        // Display the age
        System.out.println("You are " + age + " years old.");
        
        // Close the scanner object
        scanner.close();
    }
}

