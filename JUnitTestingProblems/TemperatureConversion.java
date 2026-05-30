package JUnitTestingProblems;
import java.util.Scanner;

public class TemperatureConversion {
    

    public static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

  
    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Conversion:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");

        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.print("Enter temperature in Celsius: ");
            double c = sc.nextDouble();

            double result = celsiusToFahrenheit(c);
            System.out.println("Fahrenheit: " + result);

        } else if (choice == 2) {
            System.out.print("Enter temperature in Fahrenheit: ");
            double f = sc.nextDouble();

            double result = fahrenheitToCelsius(f);
            System.out.println("Celsius: " + result);

        } else {
            System.out.println("Invalid choice");
        }

        
    }
}
    

