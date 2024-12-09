import java.util.Scanner;

public class SquareCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for a number
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

        // Calculate the square of the number
        double square = getSquare(number);

        // Display the result
        System.out.println("The square of " + number + " is: " + square);

        // Close the scanner
        scanner.close();
    }

    // Method to calculate the square of a number
    public static double getSquare(double num) {
        return num * num;
    }
}
