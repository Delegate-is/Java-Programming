import java.util.Scanner;
 
public class ArithmeticCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Display menu
        System.out.println("Welcome to Arithmetic Calculator");
        System.out.println("Choose an operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.print("Enter your choice (1-4): ");
        
        int choice = scanner.nextInt();
        
        // Input two numbers
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        
        double result = 0; // Initialize result variable
        boolean validChoice = true;
        
        // Perform the selected operation
        switch (choice) {
            case 1:
                result = num1 + num2;
                System.out.println("Addition Result: " + result);
                break;
            case 2:
                result = num1 - num2;
                System.out.println("Subtraction Result: " + result);
                break;
            case 3:
                result = num1 * num2;
                System.out.println("Multiplication Result: " + result);
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Division Result: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                validChoice = false;
                System.out.println("Invalid choice! Please restart the program and select a valid option.");
        }
        
        if (validChoice) {
            System.out.println("Thank you for using the Arithmetic Calculator!");
        }
        
        scanner.close(); // Close the scanner
    }
}