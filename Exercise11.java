import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the first integer: ");
            int first = input.nextInt();
            System.out.print("Enter the second integer: ");
            int second = input.nextInt();

            long difference = (long) first - second;
            System.out.println("Difference: " + difference);
        }
    }
}
