import java.util.Scanner;

public class Exercise18 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the first string: ");
            String first = input.nextLine();
            System.out.print("Enter the second string: ");
            String second = input.nextLine();

            boolean stringsEqual = first.equals(second);
            System.out.println("The two given strings are equal: "
                    + (stringsEqual ? "True" : "False"));

            if (first.isEmpty() || second.isEmpty()) {
                System.out.println("First characters cannot be compared: "
                        + "at least one string is empty.");
            } else {
                boolean firstCharactersEqual = first.charAt(0) == second.charAt(0);
                System.out.println("The first characters are equal: "
                        + (firstCharactersEqual ? "True" : "False"));
            }
        }
    }
}
