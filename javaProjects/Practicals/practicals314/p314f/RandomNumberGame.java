// Free Coffee

import java.util.Scanner;

public class RandomNumberGame {
    public static void main(String[] args) {
        // Generate a random number between 0 and 4
        int randomNumber = (int) (Math.random() * 5);

        // Read user input using Scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Guess the number (between 0 and 4): ");
        int userGuess = input.nextInt();

        // Compare user's guess with the random number
        if (userGuess == randomNumber) {
            System.out.println("Congratulations, you won!");
        } else if (userGuess > randomNumber) {
            System.out.println("You lost, number too high");
        } else {
            System.out.println("You lost, number too low");
        }

        // Close the Scanner
        input.close();
    }
}

/*
 * Explanation:
 * 1. The program generates a random number between 0 and 4 using Math.random() and casting to int.
 * 2. User input is read using a Scanner object named 'input'.
 * 3. The user is prompted to guess the number between 0 and 4.
 * 4. The program compares the user's guess with the generated random number.
 * 5. Messages are displayed based on whether the guess is correct or not.
 * 6. The Scanner is closed to avoid resource leaks.
 *
 * To run the program:
 * 1. Save the code in a file named RandomNumberGame.java.
 * 2. Open a terminal or command prompt and navigate to the directory where the file is saved.
 * 3. Compile the program by running the command: javac RandomNumberGame.java
 * 4. Run the compiled program with the command: java RandomNumberGame
 * 5. Follow the prompt to guess the number and see if you won or lost.
 */
