//Free Coffee
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // Generate a random number between 0 and 4
        int randomNumber = random.nextInt(5);

        // Ask the user to guess the generated number
        System.out.print("Guess the number (between 0 and 4): ");
        int userGuess = scanner.nextInt();

        // Compare the user's guess with the random number
        if (userGuess == randomNumber) {
            System.out.println("Exactly, you guessed right paa!\nYour Number: " + userGuess + "\nRandom Number: " + randomNumber);
        } else if (userGuess > randomNumber) {
            System.out.println("Oh Come on!, your number is too high\nYour Number: " + userGuess + "\nRandom Number: " + randomNumber);
        } else {
            System.out.println("Oh Come on!, your number is too low\nYour Number: " + userGuess + "\nRandom Number: " + randomNumber);
        }
    }
}


/*
*
Explanation:
1. We import the Random class from the java.util package to generate random numbers.
2. We also import the Scanner class to read user input.
3. In the main() method, we create a new Random object named random to generate random numbers.
4. We create a new Scanner object named scanner to read user input from the keyboard.
5. We use the random.nextInt(5) method to generate a random number between 0 and 4 and store it in the randomNumber variable.
6. We use System.out.print() to prompt the user to guess the number.
7. The scanner.nextInt() method reads an integer entered by the user and stores it in the userGuess variable.
8. We compare the user's guess (userGuess) with the random number (randomNumber) using an if statement.
9. If the user's guess is equal to the random number, we display "Congratulations, you won!".
10. If the user's guess is greater than the random number, we display "You lost, number too high".
11. If the user's guess is less than the random number, we display "You lost, number too low".

To run the program:
1. Save the code in a file named NumberGuessingGame.java.
2. Open a terminal or command prompt and navigate to the directory where the file is saved.
3. Compile the program by running the command: javac NumberGuessingGame.java
4. Run the compiled program with the command: java NumberGuessingGame
5. Follow the prompt to guess the number (between 0 and 4).
6. See the result displayed based on your guess.
*
*
*/