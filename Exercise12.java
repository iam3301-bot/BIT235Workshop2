import java.util.Locale;
import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            input.useLocale(Locale.US);
            System.out.print("Enter the temperature in Celsius: ");
            double celsius = input.nextDouble();

            double fahrenheit = celsius * 9.0 / 5.0 + 32.0;
            System.out.printf(Locale.US, "Fahrenheit: %.2f%n", fahrenheit);
        }
    }
}
