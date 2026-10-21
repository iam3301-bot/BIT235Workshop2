import java.util.Locale;

public class Exercise15 {
    public static void main(String[] args) {
        final double PI = 3.14;
        double earthDiameter = 7600.0;
        double sunDiameter = 865000.0;
        double earthRadius = earthDiameter / 2.0;
        double sunRadius = sunDiameter / 2.0;

        double earthVolume = (4.0 / 3.0) * PI * Math.pow(earthRadius, 3);
        double sunVolume = (4.0 / 3.0) * PI * Math.pow(sunRadius, 3);
        double ratio = sunVolume / earthVolume;

        System.out.printf(Locale.US, "Earth volume: %.6e cubic miles%n",
                earthVolume);
        System.out.printf(Locale.US, "Sun volume: %.6e cubic miles%n",
                sunVolume);
        System.out.printf(Locale.US, "Sun-to-Earth volume ratio: %.2f%n", ratio);
    }
}
