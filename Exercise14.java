import java.util.Locale;

public class Exercise14 {
    public static void main(String[] args) {
        double principal = 5000.0;
        double rate = 0.04;
        int years = 10;

        double amount = principal * Math.pow(1.0 + rate, years);
        System.out.printf(Locale.US, "Amount after %d years: $%.2f%n",
                years, amount);
    }
}
