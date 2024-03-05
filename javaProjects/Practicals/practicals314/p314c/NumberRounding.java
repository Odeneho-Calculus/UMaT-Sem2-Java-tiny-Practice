// Free Coffee

public class NumberRounding {
    public static void main(String[] args) {
        // Given numbers for rounding
        double num1 = 4.53;
        double num2 = -3.1;

        // Display the results of different rounding methods
        System.out.println("Ceil of 4.53: " + Math.ceil(num1));
        System.out.println("Floor of 4.53: " + Math.floor(num1));
        System.out.println("Round of 4.53: " + Math.round(num1));
        System.out.println("Ceil of -3.1: " + Math.ceil(num2));
        System.out.println("Floor of -3.1: " + Math.floor(num2));
        System.out.println("Round of -3.1: " + Math.round(num2));
    }
}

/*
 * Explanation:
 * 1. The program demonstrates different rounding methods provided by the Math class.
 * 2. Math.ceil() is used to round up to the nearest integer.
 * 3. Math.floor() is used to round down to the nearest integer.
 * 4. Math.round() is used to round to the nearest integer.
 * 5. Results for both positive and negative numbers are displayed using System.out.println().
 *
 * To run the program:
 * 1. Save the code in a file named NumberRounding.java.
 * 2. Open a terminal or command prompt and navigate to the directory where the file is saved.
 * 3. Compile the program by running the command: javac NumberRounding.java
 * 4. Run the compiled program with the command: java NumberRounding
 * 5. See the results of ceil, floor, and round operations displayed for the given numbers.
 */
