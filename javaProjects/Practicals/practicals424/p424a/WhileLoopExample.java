// Free Coffee

public class WhileLoopExample {
    public static void main(String[] args) {
        // Initialize variables
        int count = 1;
        int number = 2;

        // Use a while loop to print the multiplication table of 2 up to 5 times
        while (count <= 5) {
            System.out.println(number * count);
            count++;
        }
    }
}

/*
 * Explanation:
 * 1. The program uses a while loop to print the multiplication table of 2.
 * 2. 'count' is initialized to 1, and 'number' is set to 2.
 * 3. The while loop runs as long as 'count' is less than or equal to 5.
 * 4. Inside the loop, 'number * count' is printed, representing successive values in the table.
 * 5. 'count' is incremented after each iteration to avoid an infinite loop.
 *
 * To run the program:
 * 1. Save the code in a file named WhileLoopExample.java.
 * 2. Open a terminal or command prompt and navigate to the directory where the file is saved.
 * 3. Compile the program by running the command: javac WhileLoopExample.java
 * 4. Run the compiled program with the command: java WhileLoopExample
 * 5. Observe the multiplication table of 2 printed up to 5 times in the console.
 */
