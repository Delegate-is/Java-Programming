import java.util.Scanner;
 
public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        System.out.println("Temperature Converter");
        System.out.println("Choose the conversion type:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Celsius to Kelvin");
        System.out.println("4. Kelvin to Celsius");
        System.out.print("Enter choice (1-4): ");
        int choice = scanner.nextInt();
 
        System.out.print("Enter temperature: ");
        double temp = scanner.nextDouble();
 
        switch (choice) {
            case 1:
                System.out.println(temp + " Celsius = " + celsiusToFahrenheit(temp) + " Fahrenheit");
                break;
            case 2:
                System.out.println(temp + " Fahrenheit = " + fahrenheitToCelsius(temp) + " Celsius");
                break;
            case 3:
                System.out.println(temp + " Celsius = " + celsiusToKelvin(temp) + " Kelvin");
                break;
            case 4:
                System.out.println(temp + " Kelvin = " + kelvinToCelsius(temp) + " Celsius");
                break;
            default:
                System.out.println("Invalid choice!");
        }
        scanner.close();
    }
 
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }
 
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
 
    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }
 
    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }
}