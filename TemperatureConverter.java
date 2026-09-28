import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Temperature Converter");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Celsius to Kelvin");
        System.out.println("4. Kelvin to Celsius");
        System.out.println("5. Fahrenheit to Kelvin");
        System.out.println("6. Kelvin to Fahrenheit");

        System.out.print("Enter your choice (1-6): ");
        int choice = sc.nextInt();

        System.out.print("Enter temperature: ");
        double temperature = sc.nextDouble();

        double result;

        switch (choice) {
            case 1:
                result = (temperature * 9 / 5) + 32;
                System.out.println("Temperature in Fahrenheit: " + result + " °F");
                break;

            case 2:
                result = (temperature - 32) * 5 / 9;
                System.out.println("Temperature in Celsius: " + result + " °C");
                break;

            case 3:
                result = temperature + 273.15;
                System.out.println("Temperature in Kelvin: " + result + " K");
                break;

            case 4:
                result = temperature - 273.15;
                System.out.println("Temperature in Celsius: " + result + " °C");
                break;

            case 5:
                result = (temperature - 32) * 5 / 9 + 273.15;
                System.out.println("Temperature in Kelvin: " + result + " K");
                break;

            case 6:
                result = (temperature - 273.15) * 9 / 5 + 32;
                System.out.println("Temperature in Fahrenheit: " + result + " °F");
                break;

            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}