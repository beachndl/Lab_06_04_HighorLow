import java.util.Random;
import java.util.Scanner;

public class HighorLow {
    public static void main(String[] args) {
        // Scanner
        Scanner in = new Scanner(System.in);

        // Random number gen
        Random gen = new Random();
        int val = gen.nextInt(10) + 1; // Random number 1 to 10

        // Variable declaration
        int guess = 0;
        String trash = "";
        boolean done = false;

        // Get user input + validate
        do {
            System.out.print("Guess a number between 1 and 10: ");

            if (in.hasNextInt()) {
                // Safe to read in integer
                guess = in.nextInt();
                in.nextLine(); // Clear the buffer

                // Check if number is between 1 and 10
                if (guess >= 1 && guess <= 10) {
                    // Valid input, end the loop
                    done = true;
                } else {
                    System.out.println("\nYour guess must be between 1 and 10!\n");
                }
            } else {
                // Not an integer, cannot use nextInt()
                trash = in.nextLine(); // Read input as String
                System.out.println("\nInvalid input: " + trash);
                System.out.println("Please enter a valid number!\n");
            }
        } while (!done);

        // Display the results
        System.out.println("\nThe random number was: " + val);

        // Conditions for low, high, or spot on
        if (guess < val) {
            System.out.println("Your guess was too low!");
        } else if (guess > val) {
            System.out.println("Your guess was too high!");
        } else {
            System.out.println("Your guess was spot on!");
        }
    }
}