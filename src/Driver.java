import java.util.ArrayList;
import java.util.Scanner;

/**
 * Demonstrates how to use the Die class.
 *
 * @author Emma Lee
 * @version 2023
 */
public class Driver {

    /**
     * Drives the program.
     *
     * @param args command line arguments (unused)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean playAgain;

        do {
            playAgain = false; // Set to false by default, change  if the user wants to play again

            System.out.print("How many dice would you like to create? ");
            int numberOfDice = scanner.nextInt();

            ArrayList<Die> diceList = new ArrayList<>(); // Create an ArrayList to store the Die objects

            for (int i = 0; i < numberOfDice; i++) {
                System.out.print("Enter the number of sides for die " + (i + 1) + ": ");
                int sides = scanner.nextInt();

                Die die = new Die(sides); // Create a new Die with the specified number of sides

                diceList.add(die);  // Add die to the ArrayList
            }

            int sum = 0;
            for (Die die : diceList) {
                int rollResult = die.roll();
                sum += rollResult; // Roll each die and calculate the sum
            }

            System.out.println("Roll results:");
            for (int i = 0; i < numberOfDice; i++) {
                Die die = diceList.get(i);
                System.out.println("Roll result of die " + (i + 1) + ": " + die.getFaceValue());  // Display the individual roll results
            }

            System.out.println("Sum of all dice rolls: " + sum);  // Display the sum to the user

            System.out.print("Do you want to play again? (yes/no): ");  // Ask the user if they want to play again
            String playAgainInput = scanner.next();
            if (playAgainInput.equalsIgnoreCase("yes")) {
                playAgain = true;
            }
        } while (playAgain);

        System.out.println("Thank you for playing!");
        scanner.close();
    }
}