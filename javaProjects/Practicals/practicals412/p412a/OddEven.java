// Free Coffee

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        // Read a number from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is even
        if (number % 2 == 0) {
            System.out.println(number + " is an even number");
        }

        // Check if the number is odd
        if (number % 2 != 0) {
            System.out.println(number + " is an odd number");
        }

        // Close the Scanner
        scanner.close();
    }
}

/*
 * Explanation:
 * 1. The program checks whether a given number is even or odd using the modulus operator (%).
 * 2. The user is prompted to enter a number using a Scanner object named 'scanner'.
 * 3. The program checks if the number is divisible by 2 (even) or not (odd) and prints the result.
 * 4. The Scanner is closed to avoid resource leaks.
 *
 * To run the program:
 * 1. Save the code in a file named OddEven.java.
 * 2. Open a terminal or command prompt and navigate to the directory where the file is saved.
 * 3. Compile the program by running the command: javac OddEven.java
 * 4. Run the compiled program with the command: java OddEven
 * 5. Enter a number when prompted and see if it's even or odd.
 */
