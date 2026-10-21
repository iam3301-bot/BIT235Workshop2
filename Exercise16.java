import java.util.Locale;

public class Exercise16 {
    public static void main(String[] args) {
        double tankLitres = 40.0;
        double normalConsumption = 8.0;
        double roughConsumption = normalConsumption * 1.15;

        double normalDistance = tankLitres / normalConsumption * 100.0;
        double roughDistance = tankLitres / roughConsumption * 100.0;
        System.out.printf(Locale.US, "Normal road distance: %.2f km%n",
                normalDistance);
        System.out.printf(Locale.US, "Rough road distance: %.2f km%n",
                roughDistance);
    }
}
