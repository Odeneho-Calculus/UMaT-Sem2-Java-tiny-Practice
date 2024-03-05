// Free Coffee

public class SetOperations {
    public static void main(String[] args) {
        // Given set of numbers
        double[] set = {-2.1, -1.5, -0.6};

        // Calculate and display maximum and minimum values in the set
        System.out.println("Maximum value: " + Math.max(Math.max(set[0], set[1]), set[2]));
        System.out.println("Minimum value: " + Math.min(Math.min(set[0], set[1]), set[2]));

        // Calculate and display absolute values
        System.out.println("Absolute value of -1.51: " + Math.abs(-1.51));
        System.out.println("Absolute value of 1.51: " + Math.abs(1.51));
    }
}

/*
 * Explanation:
 * 1. The program performs set operations using Math.max(), Math.min(), and Math.abs() methods.
 * 2. Math.max() is used to find the maximum value in the given set of numbers.
 * 3. Math.min() is used to find the minimum value in the given set of numbers.
 * 4. Math.abs() is used to calculate the absolute value of a given number.
 * 5. The results are displayed using System.out.println().
 *
 * To run the program:
 * 1. Save the code in a file named SetOperations.java.
 * 2. Open a terminal or command prompt and navigate to the directory where the file is saved.
 * 3. Compile the program by running the command: javac SetOperations.java
 * 4. Run the compiled program with the command: java SetOperations
 * 5. See the maximum, minimum values, and absolute values displayed for the given set.
 */
