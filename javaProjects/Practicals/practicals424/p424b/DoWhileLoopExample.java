// Free Coffee

public class DoWhileLoopExample {
    public static void main(String[] args) {
        // Initialize variables
        int sum = 0;
        int number = 1;

        // Use a do-while loop to calculate the sum of the first 8 integers
        do {
            sum += number;
            number++;
        } while (number <= 8);

        // Print the sum of the first 8 integers
        System.out.println("Sum of the first 8 integers: " + sum);
    }
}

/*
 * Explanation:
 * 1. The program uses a do-while loop to calculate the sum of the first 8 integers.
 * 2. 'sum' is initialized to 0, and 'number' is set to 1.
 * 3. The do-while loop executes the code block at least once, then checks the condition.
 * 4. Inside the loop, 'number' is added to 'sum', and 'number' is incremented.
 * 5. The loop continues as long as 'number' is less than or equal to 8.
 * 6. The sum of the first 8 integers is printed using System.out.println().
 *
 * To run the program:
 * 1. Save the code in a file named DoWhileLoopExample.java.
 * 2. Open a terminal or command prompt and navigate to the directory where the file is saved.
 * 3. Compile the program by running the command: javac DoWhileLoopExample.java
 * 4. Run the compiled program with the command: java DoWhileLoopExample
 * 5. See the sum of the first 8 integers displayed in the console.
 */
