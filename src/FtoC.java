import java.util.Scanner;

public class FtoC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double fahrenheit, celsius;

        do {
            System.out.print("Enter a temperature in Fahrenheit: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input! Please enter a valid number.");
                scanner.next(); // discard the invalid input
            }
            fahrenheit = scanner.nextDouble();
            if (fahrenheit < -459.67) {
                System.out.println("Invalid temperature! The lowest possible temperature in Fahrenheit is -459.67");
            }
        } while (fahrenheit < -459.67);

        celsius = (fahrenheit - 32) * 5 / 9;

        System.out.printf("%.2f degrees Fahrenheit is equal to %.2f degrees Celsius.", fahrenheit, celsius);
    }
}
