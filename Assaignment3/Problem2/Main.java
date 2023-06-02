package Assignment3.Problem2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String firstName;
        String lastName;
        String dateOfBirth;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your first name: ");
        firstName = scanner.nextLine();

        System.out.println("Enter your last name: ");
        lastName = scanner.nextLine();

        System.out.println("Enter your birth date (yyyy-mm-dd): ");
        dateOfBirth = scanner.nextLine();

        HeartRates heartRates = new HeartRates(firstName,lastName,dateOfBirth);
        System.out.println(heartRates);

        scanner.close();

    }
}