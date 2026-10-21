import java.util.Locale;
import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            input.useLocale(Locale.US);
            System.out.print("Enter the circle radius: ");
            double radius = input.nextDouble();
            if (radius < 0.0) {
                System.out.println("The radius must be nonnegative.");
                return;
            }

            final double PI = 3.14;
            double area = PI * Math.pow(radius, 2);
            System.out.printf(Locale.US, "Circle area: %.2f%n", area);
        }
    }
}
