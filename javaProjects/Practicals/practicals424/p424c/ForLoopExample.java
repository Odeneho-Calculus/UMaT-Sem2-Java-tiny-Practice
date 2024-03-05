// Free Coffee

public class ForLoopExample {
    public static void main(String[] args) {
        // Initialize variables
        int sum = 0;

        // Use a for loop to calculate the sum of the first 10 integers
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }

        // Print the sum of the first 10 integers
        System.out.println("Sum of the first 10 integers: " + sum);
    }
}

/*
 * Explanation:
 * 1. The program uses a for loop to calculate the sum of the first 10 integers.
 * 2. 'sum' is initialized to 0.
 * 3. The for loop runs from 'i' equal to 1 to 10 (inclusive).
 * 4. Inside the loop, 'i' is added to 'sum'.
 * 5. The loop iterates 10 times, each time adding the value of 'i' to 'sum'.
 * 6. The sum of the first 10 integers is printed using System.out.println().
 *
 * To run the program:
 * 1. Save the code in a file named ForLoopExample.java.
 * 2. Open a terminal or command prompt and navigate to the directory where the file is saved.
 * 3. Compile the program by running the command: javac ForLoopExample.java
 * 4. Run the compiled program with the command: java ForLoopExample
 * 5. See the sum of the first 10 integers displayed in the console.
 */
