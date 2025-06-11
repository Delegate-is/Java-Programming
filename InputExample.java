//simple Java program to print "Hello World"
import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter your name: ");

        // Read input from user
        String name = scanner.nextLine();

        // Display input
        System.out.println("Hello, " + name + "!");

        // Close the scanner
        scanner.close();
    }
}